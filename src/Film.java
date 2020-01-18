import javafx.scene.control.ContentDisplay;

public class Film {

    public ContentDisplay getFilm(){
        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.dbConnectionFilm("SELECT TOP 10 * FROM Film");
        return null;
    }




}


