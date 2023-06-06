import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AvailableRoomsController implements Initializable {

    public AnchorPane availableRoomsContext;
    public TableView availableTable;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public TableColumn colTick;
    public TableColumn colPrice;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));
        colTick.setCellValueFactory(new PropertyValueFactory("button"));
        loadAvailable();
    }

    private void loadAvailable() {
        ObservableList<AvailableTM> cObList= FXCollections.observableArrayList();
        for (Available c: AvailableDatabase.aTable) {
            RadioButton b = new RadioButton();
            AvailableTM tm= new AvailableTM(c.getRoomNo(),c.getRoomType(),c.getPrice(),b);
            cObList.add(tm);
            availableTable.setItems(cObList);
        }
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        onAction("BookRoomsReception");
    }
    public void bookNowOnAction(ActionEvent actionEvent) throws IOException {
        onAction("CustomerDetails");
    }
    public void onAction(String fileName) throws IOException {
        Stage stage = (Stage) availableRoomsContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(fileName+".fxml"))));
        stage.centerOnScreen();
    }


}
