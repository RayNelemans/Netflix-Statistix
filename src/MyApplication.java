import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.sql.Statement;


public class MyApplication extends Application implements DatabaseMethods {

    @Override
    public void start(Stage stage) throws Exception {

        String connectionUrl = "jdbc:sqlserver://localhost\\MSSQLSERVER;databaseName=Netflix-Statistix;integratedSecurity=true";
        ResultSet rs = null;

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Film film = new Film();
        stage.setTitle("Netflix-Statistix");
        BorderPane borderPane = new BorderPane();
        Label label1 = new Label("Netflix-Statistix");
        Label label2 = new Label("Database data here");
        Menu menu = new Menu("Menu");
        Menu menu2 = new Menu("Leeftijd");
        Button button = new Button("test");
        TextField textField = new TextField();
        TableView tableView = new TableView();
        TableView tableView1 = new TableView();

        button.setOnAction((event) -> {
            ContentDisplay contentDisplay = film.getFilm();
            label2.setContentDisplay(contentDisplay);
            label2.setText(String.valueOf(contentDisplay));

        });


        MenuBar mb = new MenuBar();
        mb.getMenus().add(menu);
        mb.getMenus().add(menu2);

        borderPane.setTop(new Button("Netflix-Statistix"));
        label1.setAlignment(Pos.TOP_CENTER);
        label1.setStyle("-fx-background-color:RED");
        label1.setFont(new Font("Cambria", 32));               // Styling voor label1.
        mb.setStyle("-fx-background-color:RED");

        VBox vBox = new VBox(label1, mb, button, label2, tableView, tableView1, borderPane);
        vBox.setStyle("-fx-background-color:RED");


        Scene mainView = new Scene(vBox, 1344, 756);        //Zodat als je uit vollegdig scherm gaat de applicatie window niet heel klein is.
        stage.setScene(mainView);
        stage.show();

        stage.setFullScreen(true);
    }

    @Override
    public void dbConnectionAccount(String SQLInput) {

    }

    @Override
    public void dbConnectionEpisode(String SQLInput) {

    }

    @Override
    public void dbConnectionContent(String SQLInput) {

    }

    @Override
    public void dbConnectionContentUser(String SQLInput) {

    }

    @Override
    public void dbConnectionFilm(String SQLInput) {

    }

    @Override
    public void dbConnectionUser(String SQLInput) {

    }

    @Override
    public void dbConnectionSeries(String SQLInput) {

    }
}

