import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/some-mysql";
    static final String USER = "root";
    static final String PASS = "my-secret-pw";


    public static void main(String[] args){


        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)
        ) {
            System.out.println("Connection Established");
        } catch (SQLException e) {

            System.out.println("Connection Error");
            e.printStackTrace();
        }
    }
}
