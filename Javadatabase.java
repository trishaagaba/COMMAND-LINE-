import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Javadatabase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","root123");
            System.out.println("CONNECTION ESTABLISHED ");
            Statement st = con.createStatement();
            System.out.println("ENTER EMPLOYEE ID");
            int empid = sc.nextInt();
            System.out.println("ENTER EMPLOYEE NAME");
            String emname = sc.nextLine();
            st.executeUpdate("insert into empInfo value('"+empid+"','"+emname+"')");
            System.out.println("Values inserted successfully.THANK YOU");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
