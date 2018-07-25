package pas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pas.model.Department;
import pas.service.DepartmentService;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/department" , produces = "application/json;charset=UTF-8")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    /**
     * 部门列表
     * @param modelMap
     * @return
     */
    @GetMapping(value = "/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("departments", departmentService.all());
        return "index";
    }

    /**
     * 跳转至添加部门页面
     * @return
     */
    @GetMapping(value = "/add")
    public String add(){
        return "add-department";
    }

    @RequestMapping(value = "/store")
    // public void store(HttpServletRequest request){
    public void store(@ModelAttribute("department") Department department){
        System.out.println(department);
        // return "132";
    }

    /**
     * 根据Id 删除部门
     * @param id
     */
    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Integer id){
        departmentService.deleteById(id);
    }

    /**
     * 根据Id 显示部门
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    @ResponseBody
    public Object show(@PathVariable("id") Integer id){
        return departmentService.findById(id);
    }


}
