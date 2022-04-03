package methods;

public class MyFirstReturn {
    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getNumber());
        System.out.println(checkName());
    }

    public static int getNumber() {
//        System.out.println("bede zwracać wartość 5");
        return 5;
    }


    public static String getName() {
        return "Twój wiek to: ";
    }

    public static boolean checkName() {
        return true;
    }


}
