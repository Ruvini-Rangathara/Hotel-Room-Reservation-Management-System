import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
public class AdminController {
    public AnchorPane adminContext;
    public void roomsOnAction(ActionEvent actionEvent) throws IOException {
        onAction("RoomsAdmin");
    }

    public void mealPackagesOnAction(ActionEvent actionEvent) throws IOException {
        onAction("MealPackagesAdmin");
    }

    public void incomeReportsOnAction(ActionEvent actionEvent) throws IOException {
        onAction("AdminIncomeReport");
    }

    public void adminLogOutOnAction(ActionEvent actionEvent) throws IOException {
        onAction("HomePage");
    }
    public void onAction(String fileName) throws IOException {
        Stage stage = (Stage) adminContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(fileName+".fxml"))));
        stage.centerOnScreen();
    }
}
