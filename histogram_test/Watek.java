package com.company;

public class Watek extends Thread {

    private Obraz image;
    private int id;
    private  char charr;
    Watek(Obraz image, char charr, int id){
        this.image=image;
        this.charr= charr;
        this.id=id;
    }
    Watek( Obraz image,int charr, int id) {
        this(image,(char)charr,id);
    }

    @Override
    public void run()
    {
        int amount = image.return_number(this.charr);
        String threadInfo = "Watek:" + this.id + " " + this.charr;
        image.show(threadInfo,amount);

    }



}
