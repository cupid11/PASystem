package demo.basic.dao;

import com.github.pagehelper.PageHelper;
import demo.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.OrderBy;
import java.util.List;

public class BasicDao<T> {
    @Autowired
    private Mapper<T> mapper = null;

    public T findOneById(Long id){
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> findAll(){
        // return mapper.selectAll();
        Example example = new Example(User.class);
        example.setOrderByClause("id DESC");

        return mapper.selectByExample(example);
    }

    public void deleteById(Long id){
        mapper.deleteByPrimaryKey(id);
    }

    public int storeUser(T t){
        return mapper.insert(t);
    }

    public List<T> queryByPage(Example e, int page, int pageSize) {

        PageHelper.startPage(page, pageSize);
        Example example = new Example(User.class);
        example.setOrderByClause("id DESC");
        return mapper.selectByExample(e);
    }
}
