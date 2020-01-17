public class Content {

    public void getContent() {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionContent("SELECT TOP 10 * FROM Content");

    }
}
