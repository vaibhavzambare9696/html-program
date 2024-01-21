package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo1 {
    public static void main(String[] args) {

        try {
           
            Class.forName("org.postgresql.Driver");

            
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");

            
            Statement stmt = conn.createStatement();

           
           
           

            

            ResultSet rs = stmt.executeQuery("SELECT * FROM vaibhav");
            
            System.out.println("PID\tName\tGender");
            while (rs.next()) {
                int pid = rs.getInt(3);
                String name = rs.getString(2);
                String gender = rs.getString(1);
                
                System.out.printf("%d\t%s\t%s\t\n", pid, name, gender);
            }



        } catch (Exception e) {
          System.out.println("error"+e);
        }
    }
}
