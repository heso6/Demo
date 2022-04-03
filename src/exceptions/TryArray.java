package exceptions;

public class TryArray {
    public static void main(String[] args) {
        int[] tab = {10, 5, 6};


        try {
                System.out.println(tab[6]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego elemntu/indeksu w tablicy");
        }
    }
}
