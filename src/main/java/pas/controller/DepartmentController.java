package pas.controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pas.dao.DepartmentDao;
import pas.model.DepartmentMapper;
import pas.service.DepartmentService;

@Controller
@RequestMapping(value = "/department" , produces = "application/json;charset=UTF-8")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

//    @GetMapping(value = "/all")
//    @ResponseBody
//    public Object index(){
//        // return departmentService.getAllDepartments();
//    }
}
