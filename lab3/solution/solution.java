package solution;

import MyExpection.MyException;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class solution   {
   public static int Solution(List<Integer> a) throws MyException {
       if(a.isEmpty()) {throw new MyException(" Empty !!!");}
       Collections.sort(a);
       if((a.get(0)<-100000) ||(a.get(a.size()-1)>100000)){ throw new MyException("zle liczby "); }
       if(a.get(a.size()-1)<=0){return  1;}
       for(int i=1;i<a.get(a.size()-1);i++)
       {
           if(!a.contains(i)){return i;}
       }

        return a.get(a.size()-1)+1;
    }




}
