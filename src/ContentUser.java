public class ContentUser {

    public void getContentUser(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionContentUser("SELECT TOP 10 * FROM ContentUser");
    }
}
