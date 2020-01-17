import java.sql.SQLException;
import static javafx.application.Application.launch;

public class Main extends DatabaseConnection{

    public static void main(String[] args) throws SQLException {

        //launch(MyApplication.class);

        Film film = new Film();
        film.getFilm();
        Account account = new Account();
        account.getAccount();
        //Profile profile = new Profile();
        //profile.getProfile();
        Episode episode = new Episode();
        episode.getEpisode();
        Content content = new Content();
        content.getContent();
        ContentUser contentUser = new ContentUser();
        contentUser.getContentUser();
        User user = new User();
        user.getUser();
        Series series = new Series();
        series.getSeries();




    }

}
