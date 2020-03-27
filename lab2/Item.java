import java.util.ArrayList;
import java.util.List;

public class Item implements Comparable<Item> {

    String nazwa;
    ItemCondition stan;
    double masa;
    int  ilosc;
    int all=0;


    Item(String nazwa,ItemCondition stan,double masa,int ilosc){
        this.nazwa=nazwa;
        this.stan=stan;
        this.masa=masa;
        this.ilosc=ilosc;
    }

   public void print(){
        System.out.print("  nazwa : "+nazwa);
        System.out.print("  stan : "+stan);
        System.out.print("  masa : "+masa);
        System.out.println("  ilosc : "+ilosc);
    }

    @Override
    public int  compareTo(Item t){

        return this.nazwa.compareTo(t.nazwa);
    }

}
