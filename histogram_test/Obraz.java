package com.company;
import  java.util.Random;

class Obraz {

    private int size_n;
    private int size_m;
    private char[][] tab;
    private int[] histogram;

    public Obraz(int n, int m) {

        this.size_n = n;
        this.size_m = m;
        tab = new char[n][m];

        final Random random = new Random();

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                tab[i][j] = (char)(random.nextInt(94)+33);
                System.out.print(tab[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");

        histogram = new int[94];
        clear_histogram();
    }
    public char[][] return_tab(){

        return tab;
    }
    public int return_number2(char[] tab1,char charr,int n){
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(tab1[i]==charr){
                sum++;
            }
        }

        return sum;
    }

    public void clear_histogram(){

        for(int i=0;i<94;i++) histogram[i]=0;

    }

    public void calculate_histogram(){

        for(int i=0;i<size_n;i++) {
            for(int j=0;j<size_m;j++) {

                for(int k=0;k<94;k++) {
                    if(tab[i][j] == (char)(k+33)) histogram[k]++;
                }

            }
        }

    }

    public void print_histogram(){

        for(int i=0;i<94;i++) {
            System.out.print((char)(i+33)+" "+histogram[i]+"\n");
        }
    }
    public int getHistogramValue(char letter){
        return histogram[(int)letter-33];
    }

    public int return_number(char charr){
        int sum = 0;
        for(int i=0;i<size_n;i++) {
            for(int j=0;j<size_m;j++) {
                if(tab[i][j] == charr){
                    sum++;
                }
            }
        }
        histogram[(int) charr - 33] = sum;
        return sum;
    }
    public synchronized void show(String threadInfo, int amount){
        System.out.println(threadInfo + "=".repeat(amount));
    }





}