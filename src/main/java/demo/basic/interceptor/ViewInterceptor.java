package demo.basic.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ViewInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		if (modelAndView != null) {
			HandlerMethod handlerMethod = (HandlerMethod) handler;
			String viewName = modelAndView.getViewName();
			RequestMapping requestMapping = handlerMethod.getBean().getClass().getAnnotation(RequestMapping.class);
			RequestMapping r = handlerMethod.getMethodAnnotation(RequestMapping.class);
			if (requestMapping != null && r != null) {
				String basePath = requestMapping.value()[0];
				String fullPath = basePath + (viewName.startsWith("\\/") ? "" : "/") + viewName;
				modelAndView.setViewName(fullPath);
			}
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}

}
