#Demonstrates database connection in Java using JDBC with Oracle.
#The program connects to an Oracle database, retrieves student details using a SELECT query, and displays them.
#Shows the use of Connection, Statement, and ResultSet for executing SQL commands.
#Java #JDBC #Oracle #Database #SQL #ResultSet #DriverManager #DatabaseConnection
  

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class OrclConnection {
    public static void main(String[] args) {
        Connection con = null;

        try {
            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@192.168.109.28:1521:orcl",
                "ct2024503529",
                "ct2024503529"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (con == null)
            System.out.println("Database connection error!");
        else
            System.out.println("Database connected successfully");

        String name, doj;
        int age, id;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM stu_3063");

            while (rs.next()) {
                id = rs.getInt("STU_ID");
                name = rs.getString("NAME");
                age = rs.getInt("AGE");
                doj = rs.getString("REG_DATE");

                System.out.println(
                    "Student Data -\nName : " + name +
                    "\nID : " + id +
                    "\nAge : " + age +
                    "\nDate of Joining : " + doj + "\n"
                );
            }

            rs.close();
            st.close();
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
