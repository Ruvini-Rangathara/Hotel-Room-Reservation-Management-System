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

public class RoomsAdminController implements Initializable {

    public AnchorPane roomsAdminContext;
    public TextField insertRoomNo;
    public TextField insertRoomPrice;
    public ChoiceBox<String> roomTypeChoiceBox;

    public TableView roomTableAdmin;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public TableColumn colRoomPrice;


    private void loadRooms() {
        ObservableList<RoomsTM> cObList= FXCollections.observableArrayList();
        for (Rooms c: RoomDatabase.rTable) {
            RoomsTM tm= new RoomsTM(c.getRoomNo(),c.getRoomType(),c.getRoomPrice());
            cObList.add(tm);
            roomTableAdmin.setItems(cObList);
        }
    }

    String[] type = {"Single","Double","Triple","Quad"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        roomTypeChoiceBox.getItems().addAll(type);

        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        colRoomPrice.setCellValueFactory(new PropertyValueFactory("roomPrice"));
        loadRooms();
    }

    public void addRoomOnAction(ActionEvent actionEvent) {
       Rooms r1=new Rooms(
                insertRoomNo.getText(),
                roomTypeChoiceBox.getValue(),
                Integer.parseInt(insertRoomPrice.getText())
        );
        RoomDatabase.rTable.add(r1);
        loadRooms();
        insertRoomNo.clear();
        insertRoomPrice.clear();
    }

    public void modifyRoomOnAction(ActionEvent actionEvent) {

    }

    public void deleteRoomOnAction(ActionEvent actionEvent) {
        int selectedID = roomTableAdmin.getSelectionModel().getSelectedIndex();
        roomTableAdmin.getItems().remove(selectedID);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) roomsAdminContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation system");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Admin.fxml"))));
        stage.centerOnScreen();
    }
}
