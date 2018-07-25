package pas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pas.service.PermissionService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/permission" , produces = "application/json;charset=UTF-8")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping(value = "/index")
    public String index(ModelMap modelMap){
        // modelMap.put("result", permissionService.all());
        modelMap.addAttribute("result", permissionService.all());
        return "permission-index";
    }

//    @
//    public String show(@PathVariable("id") Integer id, ModelMap modelMap){
//
//    }
}
