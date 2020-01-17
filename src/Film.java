public class Film extends DatabaseConnection {

    public void getFilm(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionFilm("SELECT TOP 10 * FROM Film");
    }




}


