package parameters;

import java.util.Scanner;

public class ParametersDemo {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int number = scanner.nextInt();
//        isEven(number);
//        printIfNumberisEven(10);
//        printIfNumberisEven(5);
//        printIfNumberisEven(17);
//
//        printIfNumberCanBeDivideBy3(15);
//        printIfNumberCanBeDivideBy3(20);
//        printIfNumberCanBeDivideBy3(30);
//        printIfNumberCanBeDivideBy3(3045);
//        printIfNumberCanBeDivideBy3(37);


        int[] dividers = {2, 3, 4, 6, 5};


        printIfNumberCanBeDividedBy(inputYourOwnNumber(), dividers);


    }

    public static void printIfNumberisEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba " + number + " jest parzysta");
        } else {
            System.out.println("liczba " + number + " jest nieparzysta");
        }
    }

    public static void printIfNumberCanBeDivideBy3(int number) {
        if (number % 3 == 0) {
            System.out.println("Liczba " + number + " jest podzielna przez 3");
        } else {
            System.out.println("liczba " + number + " nie jest podzielna prez 3");
        }
    }


    public static void printIfNumberCanBeDividedBy(int number, int[] dividers) {

        for (int i = 0; i < dividers.length; i++) {

            if (number % dividers[i] == 0) {
                System.out.println("Liczba " + number + " jest podzielna przez " + dividers[i]);
            } else {
                System.out.println("Liczba " + number + "  nie jest podzielna przez " + dividers[i]);
            }

        }

//        if (number % dividers == 0) {
//            System.out.println("Liczba " + number + " jest podzielna przez " + divider);
//        } else {
//            System.out.println("Liczba " + number + "  nie jest podzielna przez " + divider);
//        }
    }

    public static int inputYourOwnNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

}
