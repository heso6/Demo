package conditionals;

public class LogicOperators {
    public static void main(String[] args) {
        System.out.println(5 > 3);

        boolean isLower = 10 <= 3;
        System.out.println(isLower);

        System.out.println("---------------------------------");

        System.out.println(2 == 2); //true
        System.out.println(2 != 3); //true
        System.out.println(2 > 3); //false
        System.out.println(2 < 3); //true
        System.out.println(2 >= 3); //false
        System.out.println(2 <= 3); //true

        System.out.println("---------------------------------");
        int x =3;
        int y = 10;

        System.out.println(x > 0 && y < 100);
        System.out.println(x > 0 && y > 100);

        System.out.println("---------------------------------");

        System.out.println(x > 0 || y > 100);
        System.out.println(x > 0 || y > 100);

    }
}
