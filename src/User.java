public class User {

    public void getUser(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionUser("SELECT TOP 10 * FROM Gebruiker");
    }
}
