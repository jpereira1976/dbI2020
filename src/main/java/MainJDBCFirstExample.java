
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainJDBCFirstExample {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test2020","root","geocom2");
//        Connection con = DriverManager.getConnection(
//                "jdbc:postgresql://localhost/test2","postgres","geocom");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from employee");
        while(rs.next())
            System.out.println(rs.getString("ssn")+"  "+rs.getString("name")+"  "+rs.getInt("age"));
        con.close();
    }

}
