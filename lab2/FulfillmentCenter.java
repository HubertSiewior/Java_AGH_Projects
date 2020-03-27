import java.util.Collections;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class FulfillmentCenter implements Comparator<Item> {
   public String nazwaMagazynu;
    double maxPojemnosc;
    double zajetaPojemnosc = 0;
    List<Item> tab = new ArrayList();
    FulfillmentCenter(double maxPojemnosc,String nazwaMagazynu)
    {
        this.maxPojemnosc=maxPojemnosc;
        this.nazwaMagazynu=nazwaMagazynu;
    }


    public void addProduct(Item t) {
        for (Item i : tab) {
            if (i.compareTo(t) == 0) {
                if (t.masa *t.ilosc + zajetaPojemnosc <= maxPojemnosc) {
                    i.ilosc = i.ilosc + t.ilosc;
                    zajetaPojemnosc = zajetaPojemnosc + i.ilosc * t.masa;
                    return;
                }

                else{
                    System.err.println("przekroczona pojemność");
                    return;
                }

            }
        }
        if (t.masa * t.ilosc + zajetaPojemnosc <= maxPojemnosc) {
            tab.add(t);
            zajetaPojemnosc = zajetaPojemnosc + t.ilosc * t.masa;
        } else {
            System.err.println(" Can't add");
            return;
        }
    }


    public void getProduct(Item t) {
        for (Item item : tab) {
            if (item.compareTo(t) == 0) {
                if (t.ilosc - 1 == 0) {
                    zajetaPojemnosc=zajetaPojemnosc-t.ilosc*t.masa;
                    tab.remove(t);
                } else {
                    zajetaPojemnosc=zajetaPojemnosc-t.masa;
                    item.ilosc = item.ilosc - 1;
                }
            }
        }

    }

    public int countByCondition(ItemCondition t) {
        int ile = 0;
        for (Item i : tab) {
            if (i.stan == t) ile++;
        }
        return ile;
    }

    public void removeProduct(Item t) {
        zajetaPojemnosc = zajetaPojemnosc - t.ilosc * t.masa;
        tab.remove(t);

    }

    public Item search(String nazwa1) {
          for(Item i :tab){
              if(i.nazwa.equals(nazwa1)){
                  return i;
              }
          }
        return null;
    }

    public void summary() {
        for (Item item : tab) {
           item.print();

        }

    }
    public Item max(){
       return  Collections.max(tab,Comparator.comparingInt(o ->o.ilosc));
    }
    public List<Item> searchPartial(String tmp) {
        List<Item> k = new ArrayList<>();
        for (Item i : tab) {
            if (i.nazwa.contains(tmp) == true) {
                k.add(i);
            }
        }
        return k;
    }

    public  List<Item> sortByName() {
        List<Item> k = new ArrayList<>();
        Collections.sort(tab,this::compare);
        for(Item i:tab){
           k.add(i);
        }
        return  k;
    }


  public  List<Item> sortByAmount() {
      List<Item> sortItems = new ArrayList<>();
      sortItems=tab;
      Collections.sort(tab, new Comparator<Item>() {
          @Override
          public int compare(Item o1, Item o2) {
              return -Integer.compare(o1.ilosc,o2.ilosc);
          }
      });


   return sortItems;
  }






    @Override
    public int compare(Item o1, Item o2) {
        return o1.nazwa.compareTo(o2.nazwa);
    }
}
