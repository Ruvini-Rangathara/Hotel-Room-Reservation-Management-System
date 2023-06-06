import java.util.ArrayList;

public class BookingListDatabase {
    public static ArrayList<BookingList> bTable = new ArrayList<BookingList>();

    static{

        bTable.add(new BookingList("001","001", "2022-9-06","2022-9-10" ,"Paid"));
        bTable.add(new BookingList("002","002", "2022-9-07","2022-9-11" ,"Paid"));
        bTable.add(new BookingList("003","004", "2022-9-07","2022-9-09" ,"Paid"));


    }
}
