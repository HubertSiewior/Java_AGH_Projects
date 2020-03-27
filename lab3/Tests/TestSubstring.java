package Tests;

import Substring.Substring;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import solution.solution;
import MyExpection.MyException;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSubstring {

    @Test
    public void NullTest() {
        String word1 = null;
        String word2 = null;
        assertThrows(MyException.class,() -> {
            Substring.substring(word1,word2);
        });
    }
    @Test
    public void testIsCorrect() {

        String word1 = "ssss";
        String word2 = "aaaa";

        assertDoesNotThrow(()->{
            Substring.substring(word1,word2);
        });

    }
    @Test
    public void testEqual() {

        String word1 = "aabb";
        String word2 = "bbaa";
      Substring sb=new Substring();
      try {
          assertEquals(2, Substring.substring(word1, word2));
      }catch (MyException e) {
          e.printStackTrace();
      }
    }

}
