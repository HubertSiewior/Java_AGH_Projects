package com.company;

public class Watek2 extends Thread{
    private Obraz image;
    private int id;
    private int start;
    private int end;


    Watek2(Obraz image,int id,int start,int end){
        this.image=image;
        this.id=id;
        this.start=start;
        this.end=end;
    }
    @Override
    public void run() {
        String threadInfo;
        for(int i=this.start;i<=this.end;i++)
        {
            threadInfo = "Watek:" + this.id + " " + (char)i;
            int letterAmount;
            letterAmount = image.return_number((char)i);
            image.show(threadInfo,letterAmount);
        }
    }

}
