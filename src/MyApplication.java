import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Netflix-Statistix");
        BorderPane borderPane = new BorderPane();
        Label label = new Label("Netflix-Statistix");

        borderPane.setTop(new Button("Netflix-Statistix"));
        label.setAlignment(Pos.TOP_CENTER);
        label.setStyle("-fx-background-color:RED");
        label.setMinSize(Double.MAX_VALUE, Double.MAX_VALUE);        // Zodat de applicatie automatisch groot opstart en er dus veel op het scherm past.
        label.setFont(new Font("Cambria", 32));               // Styling voor de label text.


        Scene mainView = new Scene(label);
        stage.setScene(mainView);
        stage.show();
    }
}
