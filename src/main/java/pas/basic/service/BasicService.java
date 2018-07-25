package pas.basic.service;

import pas.basic.dao.BasicDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BasicService<T> {

    @Autowired
    private BasicDao<T> BasicDao;

    public List<T> all() {
        return BasicDao.findAll();
    }

    public Object findById(Integer id) {
        return BasicDao.findOneById(id);
    }

    public void deleteById(Integer id){
        BasicDao.deleteById(id);
    }

    public int store(T t){
        return BasicDao.store(t);
    }

    public List<T> queryByPage(int page,int pageSize){
        return BasicDao.queryByPage(null, page, pageSize);
    }
}
