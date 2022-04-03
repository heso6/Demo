package methods;

public class HeloWorld {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("begining");
        printHelloWorld();
        byeBye();
        System.out.println("the end");
    }

    public static void printHelloWorld() {
        System.out.println("I'm inside custom method");
        System.out.println("Hello World");
    }

    public static void byeBye() {
        System.out.println(">>>>bye bye");
    }
}
