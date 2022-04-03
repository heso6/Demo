package arrays;

public class Square {
    public static void main(String[] args) {

        int n = 5;

        int[] tab = new int[n];
        int square = 0;
        for (int i = 0; i < tab.length; i++) {

            tab[i] = i * i;


            System.out.println("Element o indeksie: " + i + " ma wartość: " + tab[i]);

        }

    }
}
