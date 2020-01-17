public class Series {

    public void getSeries(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionSeries("SELECT TOP 10 * FROM Serie");
    }
}
