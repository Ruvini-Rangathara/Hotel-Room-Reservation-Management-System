import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class HomePageController {

    public AnchorPane homePageContext;

    public void adminLoginOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) homePageContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminLogin.fxml"))));
        stage.centerOnScreen();
    }
    public void receptionLoginOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) homePageContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("ReceptionLogin.fxml"))));
        stage.centerOnScreen();
    }
}
