import javax.swing.*;

public  class Circle extends Figure implements Print{
       public double r;
       double Pole,obwod;
    Circle(double r){
        if(r<=0) { throw new IllegalArgumentException("zle dane: r must be >0 "+r );}
        this.r=r;
     calculateArea();
     calculatePerimeter();
    }
    @Override
    public void print() {
        System.out.println("Promien koła wynosi   "+ r);
        System.out.println("Pole koła wynosi   "+ Pole);
        System.out.println("Obwod kola wynosi    "+ obwod);
    }
    @Override
    public double calculateArea() {Pole=Math.PI*r*r; return Pole ;   }

    @Override
    public double calculatePerimeter() { obwod=2*Math.PI*r; return obwod; }
}



