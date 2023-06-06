import java.util.ArrayList;

public class CustomerDatabase {
    public static ArrayList<Customer> cTable = new ArrayList<Customer>();

    static{

        cTable.add(new Customer("001","Ruvini","123456789","ruvini@gmail.com"));
        cTable.add(new Customer("002","Isuru","567891234","isuru@gmail.com"));
        cTable.add(new Customer("003","Ishanka","891234567","ishanka@gmail.com"));

    }

}
