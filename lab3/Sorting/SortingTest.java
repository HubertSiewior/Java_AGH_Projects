package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortingTest {
    public static void test() {
        Random random = new Random();
        MergeSort a = new MergeSort();
        QuickSort b = new QuickSort();
        BubbleSort c = new BubbleSort();
        SelectionSort d = new SelectionSort();
        InsertionSort e = new InsertionSort();

        int[] tab = new int[100000];
        int n = 100000;
        for (int i = 0; i < n; i++) tab[n - i - 1] = (random.nextInt() % 100);
       // for (int i = 0; i < n; i++) tab[n - i - 1] = i;
       // for (int i = 0; i < n; i++) tab[i] = i;
        for (int i = 0; i < n; i++) {
            System.out.println(tab[i] + " ");
        }
        long tStart = System.currentTimeMillis();
        //a.mergeSort(tab,n);
        //b.quickSort(tab,0,n-1);
        c.bubbleSort(tab,n);
      //  d.selectionSort(tab,n);
        //e.insertionSort(tab,n);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;

        for (int i = 0; i < n; i++) {
            System.out.println(tab[i] + " ");
        }
        System.out.println("Czas  :" + tEnd + " Mili s ");
        System.out.println("Czas  :" + elapsedSeconds + " s ");


    }
}
