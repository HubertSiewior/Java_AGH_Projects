package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Histogram_test {



    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Set image size: n (#rows), m(#kolumns)");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Obraz obraz_1 = new Obraz(n, m);

        obraz_1.calculate_histogram();
        obraz_1.print_histogram();
        System.out.println(" Wariant nr 1");
        Variant_nr1(obraz_1);
        System.out.println(" Wariant nr 2");
        Variant_nr2(obraz_1);

    }

    public static void Variant_nr1(Obraz image)
    {
        System.out.println("Set number of threads");
         int num_threads = scanner.nextInt();
         List<Thread> list =new LinkedList<>();

         for (int i = 0; i < num_threads; i++) {
        Thread watek = new Watek(image,i+33 ,i);
        list.add(watek);
        watek.start();
        }


        for (Thread i : list){
            try {
                i.join();
            } catch (InterruptedException e) {e.printStackTrace();}
        }

    }
    public static void Variant_nr2(Obraz image){
        System.out.println("Set number of threads");
        int num_threads = scanner.nextInt();
        List<Thread> list =new LinkedList<>();






        int interval = 94 / num_threads;
        int loss=94-interval*num_threads;
        for (int i = 0; i < num_threads; i++) {
            if(i!=num_threads-1) {
                int start = interval * i + 33;
                int end = interval * (i + 1) + 32;
                Thread watek = new Watek2(image, i, start, end);
                list.add(watek);
                watek.start(); }
            else {
                int start = interval * i + 33;
                int end = interval * (i + 1) + 32 + loss;
                Thread watek = new Watek2(image, i, start, end);
                list.add(watek);
                watek.start();
            }
        }


        for (Thread i : list){
            try {
                i.join();
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
    public static void Variant_nr3(Obraz image,int n , int m) {

        System.out.println("Set number of threads");
        int num_threads = scanner.nextInt();
        List<Thread> list =new LinkedList<>();
        char[][] tab=image.return_tab();
        char[] tab1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println("");
        }



        for (int i = 0; i < num_threads; i++) {
            tab1 = tab[i];
            Thread watek = new Watek3(image,i,tab1,n);
            list.add(watek);
            watek.start();
        }

        for (Thread i : list){
            try {
                i.join();
            } catch (InterruptedException e) {e.printStackTrace();}
        }


    }



}
