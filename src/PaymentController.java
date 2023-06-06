import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentController {
    public AnchorPane paymentContext;


    public void addBookingOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) paymentContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Bookings.fxml"))));
        stage.centerOnScreen();
    }
}
