import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;

public class Shopping {
    public static void main(String[] args) {

        Customer customer =  new Customer("Pink", 2);

        Clothing item1 = new Clothing(20.9,"Blue Jacket");
        Clothing item2 = new Clothing(10.5,"Orange T-shirt","S");
        Clothing item3 = new Clothing(10.5, "Green Scarf","S");
        Clothing item4 = new Clothing(9.2, "Blue T-shirt", "S");

        Clothing[] items = {item1, item2, item3, item4};


        for(Clothing clothing:items){
            if(clothing.getSize().equals(customer.getSize())){
                customer.addItem(items);
            }
        }
        try {
            Arrays.sort(customer.getItem());
            for (Clothing item : customer.getItem()) {
                System.out.println(item);
            }
            System.out.println(customer.getName()+"'s Total shopping amounts to : R " +customer.getTotalClothing());
            customer.averageItemPrice();
        }catch (NullPointerException e){
            System.out.println(customer.getName()+" has no clothing items in their size ("+customer.getSize()+")");
        }
    }
}
