import java.sql.SQLException;
import static javafx.application.Application.launch;

public class Main extends DatabaseConnection{

    public static void main(String[] args) throws SQLException {

        launch(MyApplication.class);

        Film film = new Film();
        film.getFilm();
        Account account = new Account();
        account.getAccount();
        Profile profile = new Profile();        // extra databaseConnection method toevoegen voor elke andere Tabel in de database.
        profile.getProfile();



    }

}
