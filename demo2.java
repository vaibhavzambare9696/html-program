import java.sql.*;

public class demo2 {
    public static void main(String[] args) {
        try {
            Connection con;
            Statement stmt;
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost/vaibhav", "postgres", "");

            if (con == null) {
                System.out.println("Connection fail");
            } else {
                System.out.println("Connection ok");
                stmt = con.createStatement();
                String query = "INSERT INTO teacher VALUES(103, 'priya', 'assistant professor', 50000)";
                stmt.executeUpdate(query);
                con.close();
                stmt.close();
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found: " + ex.getMessage());
            ex.printStackTrace();
        } catch (SQLException ex1) {
            System.out.println("SQL Error: " + ex1.getMessage());
            ex1.printStackTrace();
        } catch (Exception ex2) {
            System.out.println("Error: " + ex2.getMessage());
            ex2.printStackTrace();
        }
    }
}

