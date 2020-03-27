public  class Square extends Figure implements Print {
    public double a;
    double Pole,obwod;
    Square(double a){
        if(a<=0){  throw new IllegalArgumentException("a must be >0: " + a);}
        this.a=a;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void print() {
        System.out.println("Bok kwadratu ma następującą dlugosc    " + a);
        System.out.println("Pole kwadratu wynosi   "+ Pole);
        System.out.println("Obwod kwadratu wynosi   "+ obwod);
    }
    @Override
    public double calculateArea() {Pole=a*a; return Pole; }

    @Override
    public double calculatePerimeter() {  obwod=4*a; return obwod; }
}
