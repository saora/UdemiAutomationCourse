package course.practice.section7.class50;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {
    public Connection getConn()throws SQLException{
        String url="jdbc:mysql://localhost";
        String usr="abc";
        String pas="code";

        Connection conn =null;
        conn = DriverManager.getConnection(url, usr, pas);
        return conn;
    }

    public void withdraw(int amount)throws SQLException{
        getConn();
    }
}
