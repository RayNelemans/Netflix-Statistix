import java.awt.*;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane borderPane = new BorderPane();
        TextField textField = new TextField();
        Label label = new Label("Netflix-Statistix");

        borderPane.setTop(new Button("Netflix-Statistix"));
        label.setAlignment(Pos.TOP_CENTER);
        label.setStyle("-fx-background-color:RED");
        label.setMinSize(1344.0d, 756.0d);  // Zodat de applicatie automatisch groot is en er dus veel op het scherm past.
        label.setFont(new Font("Cambria", 32)); // Styling voor de label text.
        Scene mainView = new Scene(label);
        stage.setScene(mainView);
        stage.show();
    }
}
