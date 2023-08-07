// hello my class mates --- yo programko lagi jdbc connector , xampp, database, table sab hunu parxa ani balla chalxa hai


import java.sql.*;
public class q9 {

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "")) {
            // Input employee information
            for (int i = 1; i <= 2; i++) {
                String ename = System.console().readLine("Enter name of employee " + i + ": ");
                double salary = Double.parseDouble(System.console().readLine("Enter salary of employee " + i + ": "));
                String department = System.console().readLine("Enter department of employee " + i + ": ");

                // Insert employee data into database
                String insertQuery = "INSERT INTO employee (ename, salary, department) VALUES (?, ?, ?)";
                try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
                    pstmt.setString(1, ename);
                    pstmt.setDouble(2, salary);
                    pstmt.setString(3, department);
                    pstmt.executeUpdate();
                }
            }

            // Retrieve employee names with department 'sales'
            String retrieveQuery = "SELECT ename FROM employee WHERE department = ?";
            String departmentToSearch = "sales";
            try (PreparedStatement pstmt = connection.prepareStatement(retrieveQuery)) {
                pstmt.setString(1, departmentToSearch);
                try (ResultSet resultSet = pstmt.executeQuery()) {
                    System.out.println("Employees in the 'sales' department:");
                    while (resultSet.next()) {
                        String ename1 = resultSet.getString("ename");
                        System.out.println(ename1);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}