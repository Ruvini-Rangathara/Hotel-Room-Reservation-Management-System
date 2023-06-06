import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PayDetailsController {

    public AnchorPane payDetailsContext;

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        onAction("AddMealsReception");
    }

    public void payOnAction(ActionEvent actionEvent) throws IOException {
        onAction("Payment");
    }
    public void onAction(String fileName) throws IOException {
        Stage stage = (Stage) payDetailsContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(fileName+".fxml"))));
        stage.centerOnScreen();
    }
}
