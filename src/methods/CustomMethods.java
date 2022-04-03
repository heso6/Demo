package methods;

public class CustomMethods {
    public static void main(String[] args) {
        printHello();
        printBye();

    }


    public static void printHello() {
        System.out.println("Hello!");
        printBye();
    }

    public static void printBye() {
        System.out.println("Bye Bye!");
//        printHello();

    }

}
