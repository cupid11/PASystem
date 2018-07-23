package demo.basic.service;

import demo.basic.dao.BasicDao;
import demo.user.dao.UserDao;
import demo.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BasicService<T> {

    @Autowired
    private BasicDao <T> BasicDao;

    /**
     * 所有用户
     * @return
     */
    public List<T> allUser() {
        return BasicDao.findAll();
    }

    /**
     * 根据Id 获取用户
     * @param id
     * @return
     */
    public Object findUserById(Long id) {
        return BasicDao.findOneById(id);
    }

    /**
     * 根据ID删除用户
     * @param id
     * @return
     */
    public void deleteById(Long id){
        BasicDao.deleteById(id);
    }

    /**
     * 添加用户
     * @param t
     * @return
     */
    public int storeUser(T t){
        return BasicDao.storeUser(t);
    }

    public List<T> queryByPage(int page,int pageSize){
        return BasicDao.queryByPage(null, page, pageSize);
    }
}
