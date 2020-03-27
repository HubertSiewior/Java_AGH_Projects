import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ile=0;
            for(;;) {
                try {
                    if (ile == 5) return;
                    System.out.print("Podaj liczbę:    ");
                    System.out.print("1 to trojkat:    ");
                    System.out.print("2 to kwadrat:    ");
                    System.out.print("3 to kolo:     ");
                    System.out.println("4 to koniec programu: ");
                    int x = scanner.nextInt();

                    switch (x) {
                        case 1:
                            System.out.println("podaj boki trojkata  ");
                            try {
                                new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()).print();
                            } catch (IllegalArgumentException e) {
                                e.printStackTrace();
                            } catch (InputMismatchException e) {
                                e.printStackTrace();
                                scanner = new Scanner(System.in);
                            }
                            continue;
                        case 2:
                            System.out.println("podaj bok kwadratu   ");
                            try {
                                new Square(scanner.nextDouble()).print();
                            } catch (IllegalArgumentException e) {
                                e.printStackTrace();
                            } catch (InputMismatchException e) {
                                e.printStackTrace();
                                scanner = new Scanner(System.in);
                            }
                            continue;
                        case 3:
                            System.out.println("podaj promien kola");
                            try {
                                new Circle(scanner.nextDouble()).print();
                            } catch (IllegalArgumentException e) {
                                e.printStackTrace();
                            } catch (InputMismatchException e) {
                                e.printStackTrace();
                                scanner = new Scanner(System.in);
                            }
                            continue;
                        case 4:
                            return;
                        default:
                            System.out.println("wybieraj z 1 2 3 lub 4  ");
                            ile++;
                            break;
                    }
                }catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                    scanner = new Scanner(System.in);
                }

            }
    }

}
