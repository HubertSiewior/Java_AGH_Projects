package solution;

import MyExpection.MyException;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    public static void test()  {
        solution a=new solution();
        List<Integer> tab=new ArrayList<>();

        tab.add(1);
        tab.add(10);
        tab.add(11);
        tab.add(2);
        tab.add(4);
        tab.add(15);
        tab.add(16);
        tab.add(17);
        tab.add(18);
        tab.add(19);
        tab.add(13);
        try {
          int x=  a.Solution(tab);
          System.out.println(x);

        }catch (MyException e){System.out.println(e.getMessage());}
    }

}
