public class Episode extends DatabaseConnection {

    public void getEpisode(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionEpisode("SELECT TOP 10 * FROM Aflevering");
    }
}
