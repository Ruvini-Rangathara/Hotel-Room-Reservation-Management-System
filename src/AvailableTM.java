import javafx.scene.control.RadioButton;

import java.awt.*;

public class AvailableTM {
    private String roomNo;
    private String roomType;
    private double price;
    private RadioButton button;

    public AvailableTM() {}

    public AvailableTM(String roomNo, String roomType, double price, RadioButton button) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.price = price;
        this.button = button;
    }

    public String getRoomNo() {return roomNo;}
    public void setRoomNo(String roomNo) {this.roomNo = roomNo;}
    public String getRoomType() {return roomType;}
    public void setRoomType(String roomType) {this.roomType = roomType;}
    public RadioButton getButton() {return button;}
    public void setButton(RadioButton button) {this.button = button;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
}
