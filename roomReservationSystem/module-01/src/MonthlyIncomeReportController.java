import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MonthlyIncomeReportController implements Initializable {

    public AnchorPane monthlyIncomeContext;
    public BarChart monthlyIncomeChart;
    public ChoiceBox monthChoiceBox;
    public CategoryAxis x;
    public NumberAxis y;

    String[] monthChoice = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        monthChoiceBox.getItems().addAll(monthChoice);
    }
    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) monthlyIncomeContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation system");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminIncomeReport.fxml"))));
        stage.centerOnScreen();
    }

    public void enterOnAction(ActionEvent actionEvent) {
        XYChart.Series set1 = new XYChart.Series<>();

        set1.getData().add(new XYChart.Data<>("WEEK-1",275000));
        set1.getData().add(new XYChart.Data<>("WEEK-2",341500));
        set1.getData().add(new XYChart.Data<>("WEEK-3",453100));
        set1.getData().add(new XYChart.Data<>("WEEK-4",256300));

        monthlyIncomeChart.getData().addAll(set1);
    }


}
