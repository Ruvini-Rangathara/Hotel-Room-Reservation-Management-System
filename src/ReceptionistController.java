import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionistController {

    public AnchorPane receptionContext;

    public void bookRoomsOnAction(ActionEvent actionEvent) throws IOException {
        onAction("BookRoomsReception");
    }

    public void viewBookingsOnAction(ActionEvent actionEvent) throws IOException {
        onAction("Bookings");
    }

    public void viewCustomersOnAction(ActionEvent actionEvent) throws IOException {
        onAction("CustomerDetails");
    }

    public void cancelReservationOnAction(ActionEvent actionEvent) throws IOException {
        onAction("Bookings");
    }

    public void receptionLogOutOnAction(ActionEvent actionEvent) throws IOException {
        onAction("HomePage");
    }
    public void onAction(String fileName) throws IOException {
        Stage stage = (Stage) receptionContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(fileName+".fxml"))));
        stage.centerOnScreen();
    }
}
