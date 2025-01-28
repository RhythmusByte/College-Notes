import java.sql.*;

public class EmployeeList {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5432/employee_db";
        String username = "rhythmusbyte";
        String password = "pwd";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                double salary = rs.getDouble("salary"); 

                System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
