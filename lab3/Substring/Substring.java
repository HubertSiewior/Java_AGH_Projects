package Substring;

import MyExpection.MyException;

public class Substring {
    public static int substring(String a, String b) throws MyException {
        if(a==null || b==null)  {throw new MyException(" null !!! ");}

        if (a.contains(b)) {
            return 1;
        }
        int i = 1;
        do {
            a = a + a;
            i++;
            if (a.contains(b)) {
                return i;
            }


        } while (a.length() <= b.length());


        return -1;
    }
}
