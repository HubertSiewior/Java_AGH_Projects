package com.company;

import java.util.Random;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {

        double dx=(Math.PI-0)/1000000;
        long start = System.nanoTime();
        Calka_callable calka = new Calka_callable(0,Math.PI,dx);
        double result = 0;
        try {
            result = calka.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long end =System.nanoTime() -start;

        System.out.println("wynik calki = "+result+ "\tw czasie "+ end);







    }
}
