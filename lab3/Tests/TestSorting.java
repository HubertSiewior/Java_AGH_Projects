package Tests;
import Sorting.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.rules.Timeout;
import org.junit.Ignore;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;


import java.time.Duration;
import java.util.*;

public class TestSorting {
  static     int []tab=new int[10000];

  private static int n=10000;
  @BeforeAll
    static public void SetTab(){
        Random random = new Random();
        for(int i=0;i<n;i++ )
            tab[i]=(random.nextInt() % 10000);
     }

    @Test
    public void BubbleDuration(){
      BubbleSort bb=new BubbleSort();
     final int[]tab1=tab.clone();
     assertTimeout(Duration.ofMillis(3000),()-> bb.bubbleSort(tab1,n));
    }
    @Test
    public void InstertionDuration(){
        InsertionSort is=new InsertionSort();
      final   int[]tab1=tab.clone();
        assertTimeout(Duration.ofMillis(3000),()-> is.insertionSort(tab1,n));
    }
    @Test
    public void QuickDuration(){
        QuickSort qs=new QuickSort();
       final int[]tab1=tab.clone();
        assertTimeout(Duration.ofMillis(3000),()-> qs.quickSort(tab1,0,n-1));
    }
    @Test
    public void SelectionDuration(){
        SelectionSort ss=new SelectionSort();
     final   int[]tab1=tab.clone();
        assertTimeout(Duration.ofMillis(3000),()-> ss.selectionSort(tab1,n));
    }
    @Test
    public void MergeDuration(){
        MergeSort ms=new MergeSort();
       final int[]tab1=tab.clone();
        assertTimeout(Duration.ofMillis(3000),()-> ms.mergeSort(tab1,n));
    }
    @Test
    public void isSortedBubble(){
        int[] tab2=tab.clone() ;
        int [] tab3=tab.clone();
       BubbleSort bs= new BubbleSort();
       bs.bubbleSort(tab2,n);
        Arrays.sort(tab3);
        Assertions.assertArrayEquals(tab3,tab2);
    }
    @Test
    public void isSortedInsertion(){
        int[] tab2=tab.clone() ;
        int [] tab3=tab.clone();
        InsertionSort is=new InsertionSort();
        is.insertionSort(tab2,n);
        Arrays.sort(tab3);
        Assertions.assertArrayEquals(tab3,tab2);
    }
    @Test
    public void isSortedMerge(){
        int[] tab2=tab.clone() ;
        int [] tab3=tab.clone();
        MergeSort ms=new MergeSort();
        ms.mergeSort(tab2,n);
        Arrays.sort(tab3);
        Assertions.assertArrayEquals(tab3,tab2);
    }
    @Test
    public void isSortedSelection(){
        int[] tab2=tab.clone() ;
        int [] tab3=tab.clone();
       SelectionSort ss=new SelectionSort();
        ss.selectionSort(tab2,n);
        Arrays.sort(tab3);
        Assertions.assertArrayEquals(tab3,tab2);
    }
    @Test
    public void isSortedQuick(){
        int[] tab2=tab.clone() ;
        int [] tab3=tab.clone();
        QuickSort qs=new QuickSort();
        qs.quickSort(tab2,0,n-1);
        Arrays.sort(tab3);
        Assertions.assertArrayEquals(tab3,tab2);
    }

}