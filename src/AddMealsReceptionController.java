import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddMealsReceptionController implements Initializable {

    public AnchorPane addMealsContext;
    public ChoiceBox mealPlansChoiceBox;
    public TextField breakfastPrice;
    public TextField lunchPrice;
    public TextField dinnerPrice;

    String[] mealPlanChoice = {"Local Meals","chinese Meals","French Meals"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mealPlansChoiceBox.getItems().addAll(mealPlanChoice);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        onAction("CustomerDetails");
    }

    public void nextOnAction(ActionEvent actionEvent) throws IOException {
        onAction("PayDetails");
    }
    public void onAction(String fileName) throws IOException {
        Stage stage = (Stage) addMealsContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(fileName+".fxml"))));
        stage.centerOnScreen();
    }

    public void oknOAction(ActionEvent actionEvent) {
        breakfastPrice.setText("200");
        lunchPrice.setText("250");
        dinnerPrice.setText("300");
    }
}
