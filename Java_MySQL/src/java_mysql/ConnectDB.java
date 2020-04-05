package java_mysql;
import java.sql.*;

public class ConnectDB {
    public static void main (String[] args) {
    Connection connect = null;
   try  {
    Class.forName("com.mysql.jdbc.Driver");
    connect = DriverManager. getConnection("jdbc:mysql:/localhost/javadb"
            + "?user=root&password=root");
    
    if (connect != null){
        System.out.println("Ddatabase Connected.");
    } else {
        System.out.println("Ddatabase Connect Failed.");
    }
    
    } catch (Exception e){
        // TODO Auto-generatel catch block
        e.printStackTrace();
     }
  
   }

}
