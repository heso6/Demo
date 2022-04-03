package loops;

public class ForInFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("\r\ni: " + i);

            for (int j = 0; j < 5; j++) {
                System.out.print(" >j: " + j);
            }
            System.out.println("petla 'j' została skonczona");
        }
        System.out.println("petla 'i' została skończona");
    }
}
