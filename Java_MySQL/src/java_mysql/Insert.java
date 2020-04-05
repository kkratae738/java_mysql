package java_mysql;
import java.sql.*;
import java.util.Scanner;

public class Insert {

    public static void main(String[] args) {
        String id, firstname, lasntname, email, phone, address;
        double salary;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ชื่อ");
          firstname = scan.nextLine();
        System.out.print("นามสกุล");
          firstname = scan.nextLine();
        System.out.print("Email");
          firstname = scan.nextLine();
        System.out.print("เบอร์โทร");
          firstname = scan.nextLine();
        System.out.print("ที่อยู่");
          firstname = scan.nextLine();
        System.out.print("เงินเดื่อน");
          salary = scan.nextDouble();
          
        Connection connect = null;
        Statement state = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
    connect = DriverManager. getConnection("jdbc:mysql:/localhost/javadb"
            + "?user=root&password=root");
    
            state =connect.createStatement();
            
            String sql = "INSERT INTO tbl_users"
                    + "(firstname,lastname,Email,phone,adderss,salary,created)"
                    + "VALUES  ('"+firstname+"','"+lastnme+"','"+email+"','"+adderss+"','"+salary"')"
            state.execute(sql);
            System.out.println("Record Inserted Successfully");
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
