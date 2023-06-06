import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminIncomeReportController {

    public AnchorPane incomeReportsContext;

    public void monthlyIncomeOnAction(ActionEvent actionEvent) throws IOException {
        onAction("MonthlyIncomeReport");
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {

        onAction("Admin");
    }

    public void annuallyIncomeOnAction(ActionEvent actionEvent) throws IOException {
        onAction("AnnuallyIncomeReport");
    }
    public void onAction(String fileName) throws IOException {
        Stage stage = (Stage) incomeReportsContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation system");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(fileName+".fxml"))));
        stage.centerOnScreen();
    }
}
