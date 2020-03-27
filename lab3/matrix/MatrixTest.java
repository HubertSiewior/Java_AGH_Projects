package matrix;

import java.util.Random;

public class MatrixTest {
    public static void test(){
        Random random = new Random();
        Matrix<Integer> matrixInt1= new Matrix<>(5,5);
        Matrix<Integer> matrixInt2= new Matrix<>(5,5);
        Matrix<String> matrixString1= new Matrix<>(3,3);
        Matrix<String> matrixString2= new Matrix<>(3,3);

        MatrixIterator matrixInt1Iterator=(MatrixIterator) matrixInt2.iterator();
        MatrixIterator matrixInt2Iterator=(MatrixIterator) matrixInt2.iterator();
        MatrixIterator matrixString1Iterator=(MatrixIterator) matrixString1.iterator();
        MatrixIterator matrixString2Iterator=(MatrixIterator) matrixString2.iterator();

        while (matrixInt1Iterator.hasNext()) {
            matrixInt1Iterator.setNext(random.nextInt() % 100);
        }
        while (matrixInt2Iterator.hasNext()){
            matrixInt2Iterator.setNext(random.nextInt()%100);
        }
        while (matrixString1Iterator.hasNext()){
            matrixString1Iterator.setNext(Integer.toString(random.nextInt()%100));
        }
        while (matrixString2Iterator.hasNext()){
            matrixString2Iterator.setNext(Integer.toString(random.nextInt()%100));
        }

        System.out.println("Macierz Int 1:");
        matrixInt1.print();
        System.out.println("Macierz Int 2:");
        matrixInt2.print();
        System.out.println(" Wynik Macierzy Intow");
        try {
            Matrix<Integer> matrixIntWynik=Matrix.add(matrixInt1,matrixInt2);
            matrixIntWynik.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Macierz String 1:");
        matrixString1.print();
        System.out.println("Macierz String 2:");
        matrixString2.print();
        System.out.println("Wynik Macierzy Stringow");
        try {
           Matrix<String> matrixStringWynik=Matrix.addString(matrixString1,matrixString2);
           matrixStringWynik.print();
       } catch (Exception e) {
           e.printStackTrace();
        }

    }

}
