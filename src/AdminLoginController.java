import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLOutput;

public class AdminLoginController {

    public AnchorPane adminLoginContext;
    public TextField adminUsername;
    public TextField adminPassword;


    public void AdminLoginOnAction(ActionEvent actionEvent) throws IOException {

        if((adminUsername.getText()).equals("admin")&&(adminPassword.getText()).equals("1234")) {
            Stage stage = (Stage) adminLoginContext.getScene().getWindow();
            stage.setTitle("Blue Ocean Room Reservation System");
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Admin.fxml"))));
            stage.centerOnScreen();
        }else{
            Alert alert=new Alert(Alert.AlertType.WARNING,"Incorrect Username or Password", ButtonType.OK);
            alert.showAndWait();
        }
    }
}
