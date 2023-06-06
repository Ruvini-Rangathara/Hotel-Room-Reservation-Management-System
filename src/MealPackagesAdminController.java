import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MealPackagesAdminController implements Initializable {

    public AnchorPane mealPackagesAdminContext;
    public TextField insertMealPrice;
    public ChoiceBox<String> mealChoiceBox;
    public ChoiceBox<String> mealTypeChoiceBox;

    public TableView<Meals> mealTableAdmin;
    public TableColumn<MealsTM,String> colMealType;
    public TableColumn<MealsTM,String> colMeal;
    public TableColumn<MealsTM, Double> colMealPrice;

    String[] typeChoice = {"Local Meals","Chinese Meals","French Meals"};
    String[] mealChoice = {"Breakfast","Lunch","Dinner"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mealChoiceBox.getItems().addAll(mealChoice);
        mealTypeChoiceBox.getItems().addAll(typeChoice);

        colMealType.setCellValueFactory(new PropertyValueFactory<MealsTM,String>("mealType"));
        colMeal.setCellValueFactory(new PropertyValueFactory<MealsTM,String>("meal"));
        colMealPrice.setCellValueFactory(new PropertyValueFactory<MealsTM,Double>("mealPrice"));
        loadMeals();
    }

    private void loadMeals() {
        ObservableList<Meals> mObList= FXCollections.observableArrayList();
        for (Meals c: MealDatabase.mTable) {
            Meals tm= new Meals(c.getMealType(),c.getMeal(),c.getMealPrice());
            mObList.add(tm);

        }
        mealTableAdmin.setItems(mObList);

    }

    public void addMealOnAction(ActionEvent actionEvent) {
        Meals m1=new Meals(
                mealTypeChoiceBox.getValue(),
                mealChoiceBox.getValue(),
                Double.parseDouble(insertMealPrice.getText())
        );
        MealDatabase.mTable.add(m1);
        loadMeals();
    }
    public void modifyMealOnAction(ActionEvent actionEvent) {}

    public void deleteMealOnAction(ActionEvent actionEvent) {
        int selectedID = mealTableAdmin.getSelectionModel().getSelectedIndex();
        mealTableAdmin.getItems().remove(selectedID);
    }


    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) mealPackagesAdminContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation system");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Admin.fxml"))));
        stage.centerOnScreen();
    }


}
