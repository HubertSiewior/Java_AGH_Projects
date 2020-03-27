import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FulfillmentCenterContainer aa=new FulfillmentCenterContainer();
      FulfillmentCenter a=new FulfillmentCenter(600,"magazyn1");
        FulfillmentCenter g=new FulfillmentCenter(600,"magazyn2");
        FulfillmentCenter h=new FulfillmentCenter(600,"magazyn3");
      Item b= new Item("szachy",ItemCondition.NEW,6,1);
        Item c= new Item("piłka",ItemCondition.REFURBISHED,5,2);
        Item d= new Item("gitara",ItemCondition.USED,2,3);
        Item e= new Item("klocek_lego",ItemCondition.USED,2,4);
        Item f= new Item("auto",ItemCondition.USED,2,5);
      a.addProduct(b);
      a.addProduct(c);
      a.addProduct(d);
      a.addProduct(e);
      a.addProduct(f);
      a.summary();
        a.summary();


    }
}
