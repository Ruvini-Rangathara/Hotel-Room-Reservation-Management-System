import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookRoomsReceptionController implements Initializable {

    public AnchorPane bookRoomsContext;
    public ChoiceBox roomType;


    String[] roomTypeChoice = {"Single","Double","Triple","Quad"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        roomType.getItems().addAll(roomTypeChoice);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        onAction("Receptionist");
    }
    public void searchOnAction(ActionEvent actionEvent) throws IOException {
        onAction("AvailableRooms");
    }
    public void onAction(String fileName) throws IOException {
        Stage stage = (Stage) bookRoomsContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation system");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(fileName+".fxml"))));
        stage.centerOnScreen();

    }


}
