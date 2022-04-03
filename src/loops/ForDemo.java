package loops;

public class ForDemo {
    public static void main(String[] args) {

        //wypisz liczby od 0 do 50
        //wypisz liczby podzielne przez 3 lub 5
        //oraz wypisz na koniec ich sumę
        // oraz ilość wykonanych pętli



        int loopCounter = 0;
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
            loopCounter++;

        }

        System.out.println("suma liczb to: " + sum);
        System.out.println("ilość pętli: " + loopCounter);

    }
}
