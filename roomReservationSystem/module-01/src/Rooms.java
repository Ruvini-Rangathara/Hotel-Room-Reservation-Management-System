public class Rooms {
    private String roomNo;
    private String roomType;
    private double roomPrice;

    public Rooms() {
    }

    public Rooms(String roomNo, String roomType, double roomPrice) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public String getRoomNo() {return roomNo;}
    public void setRoomNo(String roomNo) {this.roomNo = roomNo;}
    public String getRoomType() {return roomType;}
    public void setRoomType(String roomType) {this.roomType = roomType;}
    public double getRoomPrice() {return roomPrice;}
    public void setRoomPrice(double roomPrice) {this.roomPrice = roomPrice;}
}
