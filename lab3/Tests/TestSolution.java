package Tests;


import Solution2.Solution2;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import solution.solution;
import MyExpection.MyException;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TestSolution {

    @Test
    public void testEqual() {
        List<Integer> tab = new ArrayList<>();
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
            assertEquals(3, solution.Solution(tab));
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMaxPositiveNumber() {

        List<Integer> tab = new ArrayList<>();

        tab.add(1111111111);

        assertThrows(MyException.class, () -> {
            solution.Solution(tab);
        });

    }
    @Test
    public void testMaxNegativeNumber() {
        List<Integer> tab = new ArrayList<>();

        tab.add(-1111111111);

        assertThrows(MyException.class, () -> {
            solution.Solution(tab);
        });

    }
    @Test
    public void testEmptyArr() {
        List<Integer> tab = new ArrayList<>();

        assertThrows(MyException.class, () -> {
            solution.Solution(tab);
        });

    }
}
