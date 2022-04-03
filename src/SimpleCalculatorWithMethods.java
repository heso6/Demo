import java.util.Scanner;

public class SimpleCalculatorWithMethods {
    public static void main(String[] args) {


//        System.out.println("Wynik dodawania to: " + add(2, 5));
//        System.out.println("Wynik odejmowania to : " + substract(10, 2));
//        System.out.println("Wynik możenia to : " + multiple(2, 5));4
//        System.out.println("Wynik dzielnia to : " + divide(10, 2));

        System.out.println("wybierz działanie:");
        System.out.println("dodawanie -> 1");
        System.out.println("odejmowanie -> 2");
        System.out.println("mnożenie -> 3");
        System.out.println("dzielenie -> 4");


        switch (postYourOwnNumber()) {
            case 1:
                System.out.println("Wynik dodawania to: " + add(postYourOwnNumber(), postYourOwnNumber()));
                break;
            case 2:

                System.out.println("Wynik odejmowania to : " + substract(postYourOwnNumber(), postYourOwnNumber()));
                break;

            case 3:

                System.out.println("Wynik możenia to : " + multiple(postYourOwnNumber(), postYourOwnNumber()));
                break;
            case 4:

                System.out.println("Wynik dzielnia to : " + divide(postYourOwnNumber(), postYourOwnNumber()));
                break;
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static int postYourOwnNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

}
