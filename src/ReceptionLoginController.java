import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionLoginController {

    public AnchorPane receptionLoginContext;
    public TextField receptionUsername;
    public TextField receptionPassword;

    public void ReceptionLoginOnAction (ActionEvent actionEvent) throws IOException {
        if(receptionUsername.getText().equals("reception")&&(receptionPassword.getText().equals("1234"))) {
            Stage stage = (Stage) receptionLoginContext.getScene().getWindow();
            stage.setTitle("Blue Ocean Room Reservation System");
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Receptionist.fxml"))));
            stage.centerOnScreen();
        }else{
            Alert alert=new Alert(Alert.AlertType.WARNING,"Incorrect Username or Password", ButtonType.OK);
            alert.showAndWait();
        }
    }

}
