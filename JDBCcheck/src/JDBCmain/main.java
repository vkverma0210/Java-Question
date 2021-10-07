package JDBCmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {

	public static void main(String[] args) {
		String url = "jdbc:h2:tcp://localhost/~/test1";

        Statement stmt;
        ResultSet rs;
        Connection conn;

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }

        try {
            conn = DriverManager.getConnection(url, "system", "");
            System.out.println("Connection Established Successfully.");

            stmt = conn.createStatement();
//            rs = stmt.executeQuery("Select * from USRDB");
//            while (rs.next()) {
//                System.out.println(rs.getString("USERNAME") + "\t" + rs.getString("PASSWORD"));
//            }
            
            rs = stmt.executeQuery("Select USERNAME from USRDB");
            while (rs.next()) {
                System.out.println(rs.getString("USERNAME"));
            }
            conn.close();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

	}

}
