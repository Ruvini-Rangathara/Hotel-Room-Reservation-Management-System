import javafx.scene.control.DatePicker;

public class BookingList {
    private String bookingID;
    private String roomNo;
    private String checkInDate;
    private String checkOutDate;
    private String paymentStatus;

    public BookingList() {}

    public BookingList(String bookingID, String roomNo, String checkInDate, String checkOutDate, String paymentStatus) {
        this.bookingID = bookingID;
        this.roomNo = roomNo;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.paymentStatus = paymentStatus;
    }

    public String getBookingID() {return bookingID;}
    public void setBookingID(String bookingID) {this.bookingID = bookingID;}
    public String getRoomNo() {return roomNo;}
    public void setRoomNo(String roomNo) {this.roomNo = roomNo;}
    public String getCheckInDate() {return checkInDate;}
    public void setCheckInDate(String checkInDate) {this.checkInDate = checkInDate;}
    public String getCheckOutDate() {return checkOutDate;}
    public void setCheckOutDate(String checkOutDate) {this.checkOutDate = checkOutDate;}
    public String getPaymentStatus() {return paymentStatus;}
    public void setPaymentStatus(String paymentStatus) {this.paymentStatus = paymentStatus;}
}
