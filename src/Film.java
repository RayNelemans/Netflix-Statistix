public class Film extends DatabaseConnection {

    public void getFilm(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.DBConnection("SELECT TOP 1 * FROM Boek");
    }




}


