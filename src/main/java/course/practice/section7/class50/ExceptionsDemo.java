package course.practice.section7.class50;

import java.sql.SQLException;

public class ExceptionsDemo {
    public static void main(String[] args ){
        Account acc = new Account();
        try {
            acc.withdraw(100);
        } catch (SQLException e) {
            //System.out.println(e.getMessage());
            System.out.println("Try again later...");
        }
        finally{
            System.out.println("Always is executed...");
        }
    }
}
