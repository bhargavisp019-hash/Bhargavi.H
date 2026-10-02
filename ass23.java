import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {
        try {
            // Connect to MySQL
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college",
                "root",
                "password"
            );

            Statement stmt = con.createStatement();

            // Create table
            String createTable = "CREATE TABLE students (" +
                    "student_id INT PRIMARY KEY, " +
                    "roll_no INT, " +
                    "name VARCHAR(50) NOT NULL, " +
                    "age INT, " +
                    "date_of_birth DATE, " +
                    "email_id VARCHAR(100) NOT NULL, " +
                    "phone_number VARCHAR(15) NOT NULL, " +
                    "address VARCHAR(200))";

            stmt.executeUpdate(createTable);

            // Insert 3 records
            String insert = "INSERT INTO students VALUES " +
                    "(1, 101, 'Akshay', 19, '2007-05-15', " +
                    "'akshay@gmail.com', '9876543210', 'Bangalore')," +
                    "(2, 102, 'Bhargavi', 19, '2007-03-12', " +
                    "'bhargavi@gmail.com', '9876543211', 'Bangalore')," +
                    "(3, 103, 'Rahul', 20, '2006-08-20', " +
                    "'rahul@gmail.com', '9876543212', 'Mysore')";

            stmt.executeUpdate(insert);

            System.out.println("Table created and records inserted successfully.");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
