package demo.Util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

public class SQLUtil {

    private static final ComboPooledDataSource dataSource;

    static {
        dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://localhost:33060/userInfo?useUnicode=true&characterEncoding=utf-8");
        try {
            dataSource.setDriverClass("com.mysql.jdbc.Driver");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setUser("homestead");
        dataSource.setPassword("secret");
    }

    public static DataSource getDataSource() {
        return dataSource;
    }

}
