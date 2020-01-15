import java.sql.*;

public class DatabaseConnection {
    String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=Bibliotheek;integratedSecurity=true";
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    public void DBConnection(String SQLInput) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            String SQL = SQLInput;   // De methode moet deze binnen krijgen
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-32s | %-24s |\n", " ", " ", " ").replace(" ", "-"));


            while (rs.next()) {
                int ISBN = rs.getInt("ISBN");
                String title = rs.getString("Titel");
                String author = rs.getString("Auteur");

                System.out.format("| %7d | %-32s | %-24s | \n", ISBN, title, author);
            }
            System.out.println(String.format("| %7s | %-32s | %-24s |\n", " ", " ", " ").replace(" ", "-"));

        }

        catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch (Exception e) { e.printStackTrace(); }
            if (stmt != null) try { stmt.close(); } catch (Exception e) { e.printStackTrace(); }
            if (con != null) try { con.close(); } catch (Exception e) { e.printStackTrace(); }
        }
    }


}



