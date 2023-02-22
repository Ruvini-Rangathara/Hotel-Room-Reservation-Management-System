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

public class AnnuallyIncomeReportController implements Initializable {

    public AnchorPane AnnuallyIncomeContext;
    public BarChart annualIncomeChart;
    public NumberAxis y;
    public CategoryAxis x;
    public ChoiceBox<String> yearChoiceBox;

    String[] yearChoice = {"2015","2016","2017","2018","2019","2020","2021","2022","2023"};
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        yearChoiceBox.getItems().addAll(yearChoice);

    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) AnnuallyIncomeContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation system");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("AdminIncomeReport.fxml"))));
        stage.centerOnScreen();
    }

    public void enterOnAction(ActionEvent actionEvent) {

        XYChart.Series set1 = new XYChart.Series<>();

        set1.getData().add(new XYChart.Data<>("JAN",275000));
        set1.getData().add(new XYChart.Data<>("FEB",375500));
        set1.getData().add(new XYChart.Data<>("MAR",205000));
        set1.getData().add(new XYChart.Data<>("APR",545000));
        set1.getData().add(new XYChart.Data<>("MAY",367500));
        set1.getData().add(new XYChart.Data<>("JUN",271000));
        set1.getData().add(new XYChart.Data<>("JUL",423000));
        set1.getData().add(new XYChart.Data<>("AUG",221500));
        set1.getData().add(new XYChart.Data<>("SEP",314000));
        set1.getData().add(new XYChart.Data<>("OCT",220500));
        set1.getData().add(new XYChart.Data<>("NOV",453000));
        set1.getData().add(new XYChart.Data<>("DEC",495000));

        annualIncomeChart.getData().addAll(set1);
    }


}
