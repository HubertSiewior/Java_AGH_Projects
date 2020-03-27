

import java.util.Map;
import java.util.HashMap;
import  java.util.List;
import  java.util.ArrayList;


public class FulfillmentCenterContainer {
    Map<String, FulfillmentCenter> magazyny =new HashMap<>();


    public void  addCenter(String nazwa, double ile){
     FulfillmentCenter c = new FulfillmentCenter(ile,nazwa);
     magazyny.put(nazwa,c);
    }

  public void removeCenter(String nazwaMagazynu){
 magazyny.remove(nazwaMagazynu);
  }


  public List<FulfillmentCenter> findEmpty() {
      List<FulfillmentCenter> empty=new ArrayList<>();
      for(FulfillmentCenter i:magazyny.values()){
          if(i.zajetaPojemnosc==0)
              empty.add(i);
      }
      return empty;
  }
  public  void summary(){
        for(FulfillmentCenter i :magazyny.values()){
            double percent=(i.zajetaPojemnosc/i.maxPojemnosc)*100;
            System.out.println(" Nazwa magazynu   " + i.nazwaMagazynu+" procentowe zapełnienie  "+percent+"%");
        }
  }
  public void print()
  {
      for(FulfillmentCenter i:magazyny.values()){
          i.summary();
      }
  }


}
