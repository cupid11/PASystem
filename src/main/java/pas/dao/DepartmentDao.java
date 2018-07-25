package pas.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pas.basic.dao.BasicDao;
import pas.model.Department;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public class DepartmentDao extends BasicDao<Department>{

}
