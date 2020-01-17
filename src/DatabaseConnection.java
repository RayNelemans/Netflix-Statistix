import java.sql.*;

public class DatabaseConnection {

    String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=Netflix-Statistix;integratedSecurity=true";
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public void dbConnectionAccount(String SQLInput) {      //Code om data uit de tabel Account te halen

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            String SQL = SQLInput;   // De methode moet deze binnen krijgen
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-24s | %-24s | %-24s | %-24s | %-24s | %-24s | \n", " ", " ", " ", " ", " ", " ", " ").replace(" ", "-"));


            while (rs.next()) {
                int accountID = rs.getInt("AccountID");
                String email = rs.getString("Email");
                String gebruikersnaam = rs.getString("Gebruikersnaam");
                String straatnaam = rs.getString("Straatnaam");
                int huisnummer = rs.getInt("Huisnummer");
                int toevoeging = rs.getInt("Toevoeging");
                String postcode = rs.getString("Postcode");

                System.out.format("| %7d | %-24s | %-24s | %24s | %24s | %24s | %24s |  \n", accountID, email, gebruikersnaam, straatnaam, huisnummer, toevoeging, postcode);
            }
            System.out.println(String.format("| %7s | %-24s | %-24s | %24s | %24s | %24s | %24s | \n", " ", " ", " ", " ", " ", " ", " ").replace(" ", "-"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void dbConnectionEpisode(String SQLInput) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            String SQL = SQLInput;   // De methode moet deze binnen krijgen
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-24s | %-24s | %-24s | %-28s | \n", " ", " ", " ", " ", " ").replace(" ", "-"));


            while (rs.next()) {
                int afleveringID = rs.getInt("AfleveringID");
                String serieTitel = rs.getString("SerieTitel");
                int seizoen = rs.getInt("Seizoen");
                int aflevering = rs.getInt("Aflevering");
                String afleveringTitel = rs.getString("AfleveringTitel");

                System.out.format("| %7d | %-24s | %-24s | %24s | %28s |  \n", afleveringID, serieTitel, seizoen, aflevering, afleveringTitel);
            }
            System.out.println(String.format("| %7s | %-24s | %-24s | %24s | %28s | \n", " ", " ", " ", " ", " ").replace(" ", "-"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    public void dbConnectionContent(String SQLInput) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            String SQL = SQLInput;   // De methode moet deze binnen krijgen
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-24s | %-24s | \n", " ", " ", " ").replace(" ", "-"));


            while (rs.next()) {
                int contentID = rs.getInt("ContentID");
                int afleveringID = rs.getInt("AflevingID");
                int filmID = rs.getInt("FilmID");

                System.out.format("| %7d | %-24s | %-24s |  \n", contentID, afleveringID, filmID);
            }
            System.out.println(String.format("| %7s | %-24s | %-24s | \n", " ", " ", " ").replace(" ", "-"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void dbConnectionContentUser(String SQLInput) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            String SQL = SQLInput;   // De methode moet deze binnen krijgen
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-24s | %-24s | %-24s | \n", " ", " ", " ", " ").replace(" ", "-"));


            while (rs.next()) {
                int contentUserID = rs.getInt("CU_ID");
                int accountID = rs.getInt("AccountID");
                int gebruikerID = rs.getInt("GebruikerID");
                int contentID = rs.getInt("CintentID");

                System.out.format("| %7d | %-24s | %-24s | %-24s | \n", contentUserID, accountID, gebruikerID, contentID );
            }
            System.out.println(String.format("| %7s | %-24s | %-24s | %-24s | \n", " ", " ", " ", " ").replace(" ", "-"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void dbConnectionFilm(String SQLInput) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            String SQL = SQLInput;   // De methode moet deze binnen krijgen
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-34s | %-24s | %-24s | %-24s | %-24s | \n", " ", " ", " ", " ", " ", " ").replace(" ", "-"));


            while (rs.next()) {
                int filmID = rs.getInt("FilmID");
                String titel = rs.getString("Titel");
                String genre = rs.getString("Genre");
                String leeftijd = rs.getString("Leeftijd");
                String taal = rs.getString("Taal");
                String tijdsduur = rs.getString("Tijdsduur");

                System.out.format("| %7d | %-34s | %-24s | %-24s | %-24s | %-24s |  \n", filmID, titel, genre, leeftijd, taal, tijdsduur );
            }
            System.out.println(String.format("| %7s | %-34s | %-24s | %-24s | %-24s | %-24s |  \n", " ", " ", " ", " ", " ", " ").replace(" ", "-"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void dbConnectionUser(String SQLInput){

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            String SQL = SQLInput;   // De methode moet deze binnen krijgen
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %7s | %-24s | %-24s | %-24s | %-24s | %-24s | %-24s | \n", " ", " ", " ", " ", " ", " ", " ").replace(" ", "-"));


            while (rs.next()) {
                int gebruikerID = rs.getInt("GebruikerID");
                int accountID = rs.getInt("AccountID");
                String gebruikersnaam = rs.getString("Gebruikersnaam");
                String voornaam = rs.getString("Voornaam");
                String achternaam = rs.getString("Achternaam");
                String tussenvoegsel = rs.getString("Tussenvoegsel");
                int leeftijd = rs.getInt("Leeftijd");

                System.out.format("| %7d | %-24s | %-24s | %24s | %24s | %24s | %24s |  \n", gebruikerID, accountID, gebruikersnaam, voornaam, achternaam, tussenvoegsel, leeftijd);
            }
            System.out.println(String.format("| %7s | %-24s | %-24s | %24s | %24s | %24s | %24s | \n", " ", " ", " ", " ", " ", " ", " ").replace(" ", "-"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void dbConnectionSeries(String SQLInput){

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);

            String SQL = SQLInput;   // De methode moet deze binnen krijgen
            stmt = con.createStatement();

            rs = stmt.executeQuery(SQL);

            System.out.print(String.format("| %15s | %-24s | %-24s | %-24s | %-24s | %-24s |  \n", " ", " ", " ", " ", " ", " ").replace(" ", "-"));


            while (rs.next()) {
                String titel = rs.getString("Titel");
                String genre = rs.getString("Genre");
                String aanbevolen = rs.getString("Aanbevolen");
                String leeftijd = rs.getString("Leeftijd");
                String taal = rs.getString("Taal");
                String tijdsduur = rs.getString("Tijdsduur");

                System.out.format("| %15s | %-24s | %-24s | %-24s | %-24s | %-24s |  \n", titel, genre, aanbevolen, leeftijd, taal, tijdsduur);
            }
            System.out.println(String.format("| %15s | %-24s | %-24s | %-24s | %-24s | %-24s |  \n", " ", " ", " ", " ", " ", " ").replace(" ", "-"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (stmt != null) try {
                stmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (con != null) try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    }





