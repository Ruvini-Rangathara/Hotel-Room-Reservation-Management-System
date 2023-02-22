import java.util.ArrayList;

public class AvailableDatabase {
    public static ArrayList<Available> aTable = new ArrayList<Available>();

    static{
        aTable.add(new Available("001","Single",1000));
        aTable.add(new Available("002","Double",2000));
        aTable.add(new Available("003","Triple",2500));
        aTable.add(new Available("004","Quad",3000));

    }
}
