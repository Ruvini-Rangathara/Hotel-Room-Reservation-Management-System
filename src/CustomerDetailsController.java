import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
public class CustomerDetailsController {
    public AnchorPane customerDetailsContext;
    public TextField customerNIC;
    public TextField customerName;
    public TextField customerContactNo;
    public TextField customerEmail;
    public TableView customerTable;
    public TableColumn columnCusNIC;
    public TableColumn columnCusName;
    public TableColumn columnCusContactNo;
    public TableColumn columnCusEmail;

    public void initialize(){
        columnCusName.setCellValueFactory(new PropertyValueFactory("name"));
        columnCusNIC.setCellValueFactory(new PropertyValueFactory("nic"));
        columnCusContactNo.setCellValueFactory(new PropertyValueFactory("contactNo"));
        columnCusEmail.setCellValueFactory(new PropertyValueFactory("email"));
        loadCustomers();
    }
    private void loadCustomers() {
        ObservableList<CustomerTM> cObList=FXCollections.observableArrayList();
        for (Customer c: CustomerDatabase.cTable) {
            CustomerTM tm= new CustomerTM(c.getNic(),c.getName(),c.getContactNo(),c.getEmail());
            cObList.add(tm);
            customerTable.setItems(cObList);
        }
    }

    public void enterOnAction(ActionEvent actionEvent) {
        Customer c1=new Customer(
                customerNIC.getText(),
                customerName.getText(),
                customerContactNo.getText(),
                customerEmail.getText()
        );
        CustomerDatabase.cTable.add(c1);
        loadCustomers();
        customerNIC.clear();
        customerName.clear();
        customerContactNo.clear();
        customerEmail.clear();
    }

    public void nextOnAction(ActionEvent actionEvent) throws IOException {
        onAction("AddMealsReception");
    }
    public void onAction(String fileName) throws IOException {
        Stage stage = (Stage) customerDetailsContext.getScene().getWindow();
        stage.setTitle("Blue Ocean Room Reservation System");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(fileName+".fxml"))));
        stage.centerOnScreen();
    }
    public void backToReceptionOnAction(ActionEvent actionEvent) throws IOException {
        onAction("Receptionist");
    }

}
