import java.util.ArrayList;

public class MealDatabase {
    public static ArrayList<Meals> mTable = new ArrayList<Meals>();

    static{
        mTable.add(new Meals("Local Meals","Breakfast",200));
        mTable.add(new Meals("Local Meals","Lunch",250));
        mTable.add(new Meals("Local Meals","Dinner",350));
        mTable.add(new Meals("Chinese Meals","Breakfast",250));
        mTable.add(new Meals("Chinese Meals","Lunch",300));
        mTable.add(new Meals("Chinese Meals","Dinner",350));
        mTable.add(new Meals("French Meals","Breakfast",300));
        mTable.add(new Meals("French Meals","Lunch",350));
        mTable.add(new Meals("French Meals","Dinner",400));

    }
}
