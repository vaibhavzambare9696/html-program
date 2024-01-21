package jdbcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class demo2 {
    public static void main(String[] args) {

        try {
           
            Class.forName("org.postgresql.Driver");

            
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");

            
            Statement stmt = conn.createStatement();

           
           
           

            

            int rs = stmt.executeUpdate("insert into vaibhav values(3,'samir','male')");
            
            System.out.print("count:"+rs);
    
            



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
