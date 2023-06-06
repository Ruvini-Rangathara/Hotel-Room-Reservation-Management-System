import java.util.ArrayList;

public class RoomDatabase {
    public static ArrayList<Rooms> rTable = new ArrayList<Rooms>();

    static{
        rTable.add(new Rooms("001","Single",1000));
        rTable.add(new Rooms("002","Double",2000));
        rTable.add(new Rooms("003","Triple",3000));
        rTable.add(new Rooms("004","Quad",4000));

    }
}
