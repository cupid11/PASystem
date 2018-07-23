package pas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import pas.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/departments", produces = "application/json;charset=UTF-8")
public class DepartmentController
{

    @Autowired
    private DepartmentService departmentService;

//   @GetMapping(value = "")
//    public Object index(){
//        //
//    }
}
