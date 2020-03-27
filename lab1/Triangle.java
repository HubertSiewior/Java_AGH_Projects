public class Triangle extends Figure implements Print {
    private double a, b, c;
    double Pole;
    double p, obwod;

    Triangle(double a, double b, double c) {
        if (((a + b) <= c) || ((a + c) <= b) || ((c + b) <= a)) {
            throw new IllegalArgumentException("zle dane: ");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void print() {
        System.out.println("Boki trojkata maja następujące dlugosci  " + a + "  " + b + "  " + c + "  ");
        System.out.println("Pole trojkata wynosi   " + Pole);
        System.out.println("Obwod trojkata wynosi   " + obwod);
    }

    @Override
    public double calculateArea() {
        p = ((a + b + c) / 2);
        Pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return Pole;
    }

    @Override
    public double calculatePerimeter() {
        obwod = a + b + c;
        return obwod;
    }
}
