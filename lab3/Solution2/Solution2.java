package Solution2;

import MyExpection.MyException;

public class Solution2 {


    public static int[] solution3(float[] arr, float target)throws Exception {

         int m=arr.length;
         if(m==0) {throw  new MyException(" empty !!!");}
        if(target<0) {throw  new MyException(" Target<0 !!");}
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
               if (i == j) {
                   break;
               }
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }
}
