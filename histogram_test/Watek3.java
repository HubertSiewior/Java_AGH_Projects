package com.company;

public class Watek3 extends Thread {

    private Obraz image;
    private int id;
    private  char charr;
    private char[] tab;
    private int n;
    Watek3(Obraz image,int id,char[] tab,int n){
        this.image=image;
        this.id=id;
        this.tab=tab;
        this.n=n;
    }


    @Override
    public void run()
    {
           int amount=image.return_number2(this.tab,(char)this.id,this.n);
    }



}
