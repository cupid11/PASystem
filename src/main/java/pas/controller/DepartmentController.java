package pas.controller;

import pas.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/departments", produces = "application/json;charset=UTF-8")
public class DepartmentController {

    private DepartmentService departmentService;

    // public
}
