package demo.repository;

import demo.Util.SQLUtil;
import demo.user.model.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Repository;

import javax.management.Query;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class UserRepository {

    public int storeUser(User user) {

        String sql = "insert into users values(?,?,?,?,?,?,?,?,?,?)";
        QueryRunner runner = new QueryRunner(SQLUtil.getDataSource());

        int rows = 0;
        try {
            rows = runner.update(sql, null, user.getName(), user.getAddress(),
                    user.getSex(), user.getEmail(), user.getPostcode(), user.getDescription(),
                    user.getBirth_date(), user.getCreated_at(),user.getUpdated_at());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rows;
    }

    public List<User> select(){
        String sql = "select * from users order by id desc ,updated_at desc";
        QueryRunner runner = new QueryRunner(SQLUtil.getDataSource());

        List<User> users = null;
        try {
            users = runner.query(sql, new BeanListHandler<User>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public List<User> findUserById(Long id)
    {
        String sql = "select * from users where id = ?";
        QueryRunner runner = new QueryRunner(SQLUtil.getDataSource());

        List<User> user = null;

        try {
            user = runner.query(sql, new BeanListHandler<User>(User.class), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public int deleteById(Long id)
    {
        String sql = "delete from users where id = ?";
        QueryRunner runner = new QueryRunner(SQLUtil.getDataSource());

        int row = 0;

        try {
            row = runner.update(sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return row;
    }

}
