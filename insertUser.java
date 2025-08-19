package com.Broskieshub.JDBCProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class insertUser {
   public static void main(String[] args) {
      Connection con = null;
      PreparedStatement ps = null;
      try {
         String url = "jdbc:mysql://localhost:3306/testdb";
         String user = "root";
         String password = "Micra135@";

         con = DriverManager.getConnection(url, user, password);
         System.out.println("Connected to database!");

         String sql = "INSERT INTO user (name, email) VALUES (?, ?)";

         ps = con.prepareStatement(sql);

         ps.setString(1, "Shuvajit Pal");
         ps.setString(2, "shuvajitpal103@gmail.com");

         ps.setString(1, "Debasish Behera");
         ps.setString(2, "debasish@tech69.com");
         ps.executeUpdate();

         ps.setString(1, "Farhat Akram");
         ps.setString(2, "farhatakram7077@gmail.com");
         ps.executeUpdate();

         int rowsInserted = ps.executeUpdate();
         if (rowsInserted > 0) System.out.println("A new user was inserted successfully!");
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (ps != null) ps.close();
            if (con != null) con.close();
         } catch (Exception ex) {
            ex.printStackTrace();
         }
      }
   }
}
