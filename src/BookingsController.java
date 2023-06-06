import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class BookingsController implements Initializable {

    public AnchorPane viewBookingsContext;
    public TableView bookingTable;
    public TableColumn colBookingID;
    public TableColumn colRoomNo;
    public TableColumn colCheckIn;
    public TableColumn colPaymentStatus;
    public TableColumn colCheckOut;

    public TextField insertBookingID;
    public TextField insertRoomNo;
    public DatePicker checkInDate;
    public DatePicker checkOutDate;
    public ChoiceBox paymentStatusChoiceBox;

    String[] paymentStatusChoice = {"Paid","Not Paid"};
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        paymentStatusChoiceBox.getItems().addAll(paymentStatusChoice);

        colBookingID.setCellValueFactory(new PropertyValueFactory("bookingID"));
        colRoomNo.setCellValueFactory(new PropertyValueFactory("roomNo"));
        colCheckIn.setCellValueFactory(new PropertyValueFactory("checkInDate"));
        colCheckOut.setCellValueFactory(new PropertyValueFactory("checkOutDate"));
        colPaymentStatus.setCellValueFactory(new PropertyValueFactory("paymentStatus"));

        loadBookings();
    }

    private void loadBookings() {
        ObservableList<BookingListTM> cObList= FXCollections.observableArrayList();
        for (BookingList c: BookingListDatabase.bTable) {
            BookingListTM tm= new BookingListTM(c.getBookingID(),c.getRoomNo(),c.getCheckInDate(),c.getCheckOutDate(), c.getPaymentStatus());
            cObList.add(tm);
            bookingTable.setItems(cObList);
        }
    }

    public void addOnAction(ActionEvent actionEvent) {
        LocalDate in = checkInDate.getValue();
        LocalDate out = checkOutDate.getValue();
        String test1 = in.toString();
        String test2 = out.toString();

        BookingList b1=new BookingList(
                insertBookingID.getText(),
                insertRoomNo.getText(),
                test1,
                test2,
                (String) paymentStatusChoiceBox.getValue()
        );

        BookingListDatabase.bTable.add(b1);
        loadBookings();
    }














    public void cancelOnAction(ActionEvent actionEvent) {
        int selectedID = bookingTable.getSelectionModel().getSelectedIndex();
        bookingTable.getItems().remove(selectedID);
    }

    public void backOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) viewBookingsContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation system");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Receptionist.fxml"))));
        stage.centerOnScreen();
    }


}
