import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "toor";
        String query = "INSERT INTO employees(id, name, job_title, salary) VALUES(4, 'Ubuvuabsda', 'OSAS', 0.0)";
        String deleteQuery = "DELETE FROM employees Where id = 4";
        String updateQuery = "UPDATE employees SET job_title = 'UX Engineer' Where id = 3";


        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully");
            Statement stmt = con.createStatement();
            int affectedRows = stmt.executeUpdate(updateQuery);

            if(affectedRows > 0){
                System.out.println("Insert Successful. " + affectedRows + " row(s) affected");
            }else{
                System.out.println("Insertion Failed");
            }

            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection Closed Successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}