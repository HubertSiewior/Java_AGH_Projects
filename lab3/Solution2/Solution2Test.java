package Solution2;

import MyExpection.MyException;

public class Solution2Test {
    public static void test(){

        int[] tab3 = new int[2];
        Solution2 a=new Solution2();
        float tab2[]=new float[]{2.5f,4.5f,5.5f,6.5f,10.5f,11.3f};
        try {
            tab3 = a.solution3(tab2, 8f);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i=0;i<2;i++)
            System.out.print(tab3[i]+"  ");

    }


}
