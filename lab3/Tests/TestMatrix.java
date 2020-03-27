package Tests;
import matrix.Matrix;
import matrix.MatrixIterator;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import solution.solution;
import MyExpection.MyException;
import org.junit.Ignore;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;



import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class TestMatrix {

    static Matrix<Integer> matrix1;

    @BeforeAll
    static void createMatrix(){
        matrix1 = new Matrix<>(3,3);
        MatrixIterator i = (MatrixIterator) matrix1.iterator();
    }

    @Test
    void createMatrixTest(){ assertNotNull(matrix1); }
    @Test
    void iteratorIsNotNull(){ assertNotNull(matrix1.iterator()); }
    @Test
    void createMatrixWithNegativeSizeTest(){
        assertThrows(NegativeArraySizeException.class, ()-> new Matrix<Integer>(-3,-3));
    }


}
