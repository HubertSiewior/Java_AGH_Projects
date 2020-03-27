package Substring;

import MyExpection.MyException;

public class SubstringTest {
    public static void test() throws MyException {
        String word1 = "adbd";
        String word2 = "dadb";
        String word3 = "adbd";
        String word4 = "xxxx";
        Substring a = new Substring();
        System.out.println(a.substring(word1, word2));
        System.out.println(a.substring(word3, word4));

    }
}
