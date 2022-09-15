import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Javadatabase {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","root123");
            Statement st = con.createStatement(); //creates connection to the database
            
            System.out.println("YOU'RE MOST WELCOME TO ANKA-STARTUP");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please choose one of the following: \n" //this is a menu that is given to the participant to choose from
            + "1)Register \n" + "2)Post Product" + "3)Performance" + "4)Exit");
            int choice = sc.nextInt();
                while (choice != 4 ){
                    if ( choice ==1){ //create if statements to move through the menu
                        System.out.println("Register name password product date_of_birth");
                        String name = sc.nextLine();
                        String password = sc.nextLine();
                        String date_of_birth = sc.nextLine();
                        
                        st.executeUpdate("insert into Participants value('"+name+"','"+password+"' + '"+date_of_birth+"')");
                         //sql query that sends data to the database, take note of how the query is 
                        //written and how the coloumns are written
                        System.out.println("Values inserted successfully.THANK YOU");
                        break;
                    }
                    if (choice ==2){
                        System.out.println("Post_product product_name");
                        String product_name = sc.nextLine();
                        st.executeUpdate("insert into Products value('"+product_name+"'");
                        break;
                    }
                    if (choice ==3){
                        //cron job comes in here to check the files
                        //check performance
                        break;
                    }
                    else break;
                }    
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
      
            
    }
}    
    