package Tests;
import Solution2.Solution2;
import Substring.Substring;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import solution.solution;
import MyExpection.MyException;
import org.junit.Ignore;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestSolution2 {

    @Test
    public void testIsCorrect() {
        int[] tab3 = new int[2];
        int[] tab1 = new int[2];

        float tab2[]=new float[]{2.5f,4.5f,5.5f,6.5f,10.5f,11.3f};

        assertDoesNotThrow(()->{
            Solution2.solution3(tab2, 8f);
        });

    }
    @Test
    public void testEmptyArr() {

        float tab2[] = new float[0];

        try{
          assertThrows(MyException.class,()-> Solution2.solution3(tab2, 8f));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testNegativeTarget() {

        float tab2[]=new float[]{2.5f,4.5f,5.5f,6.5f,10.5f,11.3f};

        try{
            assertThrows(MyException.class,()-> Solution2.solution3(tab2, -8f));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
