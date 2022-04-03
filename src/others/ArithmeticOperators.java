package others;

public class ArithmeticOperators {
    public static void main(String[] args) {

        //dodawanie -> +
        //odejmowanie -> -
        //mnozenie -> *
        //dzielenie -> /

        int a = 5 + 10;
        int b = 10 - 5;
        int c = 10 * 2;
        int d = 10 / 2;

        int x = a + a + d - c + b - 12;

        System.out.println("dodawanie");
        System.out.println(a);
        System.out.println("odejmowanie");
        System.out.println(b);
        System.out.println("mnożenie");
        System.out.println(c);
        System.out.println("dzielenie");
        System.out.println(d);
        System.out.println(x);

        d += d;
        System.out.println(d);

        d -= 2;
        System.out.println(d);

        System.out.println(d = d + 2);

        System.out.println(d);

        System.out.println("dzielenie z resztą");

        System.out.println(22 / 3); // 22:3 -> 7 oraz 1  reszty

        System.out.println(22 % 3); // reszta z dzielenia

        float zz = 5 / 3f;
        double xx = 5 / 3d;

        System.out.println(zz);
        System.out.println(xx);

    }
}
