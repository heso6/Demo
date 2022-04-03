package conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj pierwsza liczbę");
        double firstNumber = scanner.nextInt();

        System.out.println("podaj pierwsza liczbę");
        double secondNumber = scanner.nextInt();

        System.out.println("Wybierz dodawanie -> 1");
        System.out.println("Wybierz odejmowanie -> 2");
        System.out.println("Wybierz mnożenie -> 3");
        System.out.println("Wybierz dzielenie -> 4");

        System.out.println("");

        int operator = scanner.nextInt();

        switch (operator) {
            case 1:
                double d = firstNumber + secondNumber;
                System.out.println("Wynik działania: " + firstNumber + "+" + secondNumber + " to: " + d);
                break;
            case 2:
                double o = firstNumber - secondNumber;
                System.out.println("Wynik odejmowania: " + firstNumber + "-" + secondNumber + " to: " + o);
                break;
            case 3:
                double m = firstNumber * secondNumber;
                System.out.println("Wynik mnożenia: " + firstNumber + "*" + secondNumber + " to: " + m);
                break;
            case 4:
                double dz  = firstNumber / secondNumber;
                System.out.println("Wynik dzielenia: " + firstNumber + "/" + secondNumber + " to: " + dz);
                break;
            default:
                System.out.println("wybrałeś opcję poza zakresem!");
                System.out.println("musisz wybrać opcję od 1 do 4!!");

        }


//
//        switch (sign) {
//            case 1:
//
//                break;
//            case 2:
//
//                break;
//            default:
//                System.out.println("twoja wersja chrome, nie jest wspierania");
//        }
    }
}
