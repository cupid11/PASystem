package pas.basic.dao;

import com.github.pagehelper.PageHelper;
import pas.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public class BasicDao<T> {
    @Autowired
    private Mapper<T> mapper = null;

    public T findOneById(Long id){
        return mapper.selectByPrimaryKey(id);
    }



    public List<T> findAll(){
        Example example = new Example(User.class);
        example.setOrderByClause("id DESC");

        return mapper.selectByExample(example);
    }

    public void deleteById(Long id){
        mapper.deleteByPrimaryKey(id);
    }

    public int store(T t){
        return mapper.insert(t);
    }

    public List<T> queryByPage(Example e, int page, int pageSize) {

        PageHelper.startPage(page, pageSize);
        Example example = new Example(User.class);
        example.setOrderByClause("id DESC");
        return mapper.selectByExample(e);
    }
}
