package pas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pas.basic.service.BasicService;
import pas.dao.DepartmentDao;
import pas.model.Department;
import pas.model.DepartmentMapper;

import java.util.List;

@Service
public class DepartmentService extends BasicService<Department> {

//    @Autowired
//    private DepartmentMapper departmentMapper;
//
//    public List<Department> getAllDepartments(){
//        List<Department> list = departmentMapper.getAllDepartments(0);
//        System.out.println("123");
//        System.out.println(list);
//        return list;
//    }

}
