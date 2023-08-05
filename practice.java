// import java.awt.*;
// import javax.swing.*;

// public class practice extends JFrame {
//     public JButton b1, b2, b3, b4, b5;

//     practice() {
//         setTitle("Hello");
//         setVisible(true);
//         setSize(300, 300);

//         setLayout(new GridLayout(2,2));

//         b1 = new JButton("Button 1");
//         b2 = new JButton("Button 2");
//         b3 = new JButton("Button 3");
//         b4 = new JButton("Button 4");

//         add(b1);
//         add(b2);
//         add(b3);
//         add(b4);
//     }

//     public static void main(String[] args) {
//         practice obj = new practice();
//     }
// }

// import java.awt.*;
// import javax.swing.*;

// public class practice extends JFrame {
//     public JButton b1, b2, b3, b4, b5;

//     practice() {
//         setTitle("Hello");
//         setVisible(true);
//         setSize(300, 300);

//         setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

//         b1 = new JButton("Button 1");
//         b2 = new JButton("Button 2");
//         b3 = new JButton("Button 3");
//         b4 = new JButton("Button 4");

//         add(b1);
//         add(b2);
//         add(b3);
//         add(b4);
//     }

//     public static void main(String[] args) {
//         practice obj = new practice();
//     }
// }

// import java.awt.*;
// import javax.swing.*;

// class practice extends JFrame {
//     public JButton b1, b2, b3, b4, b5;

//     practice() {
//         setTitle("Border layout");
//         setVisible(true);
//         setSize(300, 300);

//         setLayout(new BorderLayout(20,22));

//         b1 = new JButton("Button 1");
//         b2 = new JButton("Button 2");
//         b3 = new JButton("Button 3");
//         b4 = new JButton("Button 4");
//         b5 = new JButton("Button 5");

//         add(b1, BorderLayout.CENTER);
//         add(b2, BorderLayout.SOUTH);
//         add(b3, BorderLayout.WEST);
//         add(b4, BorderLayout.EAST);
//         add(b5, BorderLayout.NORTH);
//     }

//     public static void main(String[] args) {
//         practice obj = new practice();
//     }
// }

import java.sql.*;

public class practice {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_db";
    static final String JDBC_USER = "root";
    static final String JDBC_PASS = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS)) {
            // Create table if not exists
            String createTableQuery = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "department VARCHAR(100)" +
                    ")";
            try (Statement stmt = connection.createStatement()) {
                stmt.executeUpdate(createTableQuery);
            }

            // Input student information
            for (int i = 1; i <= 2; i++) {
                String name = System.console().readLine("Enter name of student " + i + ": ");
                String department = System.console().readLine("Enter department of student " + i + ": ");

                // Insert student data into database
                String insertQuery = "INSERT INTO students (name, department) VALUES (?, ?)";
                try (PreparedStatement pstmt = connection.prepareStatement(insertQuery)) {
                    pstmt.setString(1, name);
                    pstmt.setString(2, department);
                    pstmt.executeUpdate();
                }
            }

            // Retrieve student name with department 'sales'
            String retrieveQuery = "SELECT name FROM students WHERE department = ?";
            String departmentToSearch = "sales";
            try (PreparedStatement pstmt = connection.prepareStatement(retrieveQuery)) {
                pstmt.setString(1, departmentToSearch);
                try (ResultSet resultSet = pstmt.executeQuery()) {
                    System.out.println("Students with department 'sales':");
                    while (resultSet.next()) {
                        String studentName = resultSet.getString("name");
                        System.out.println(studentName);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
