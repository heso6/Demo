package conditionals;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        int chromeVersion = 98;

        switch (chromeVersion) {
            case 98:
                System.out.println("Masz wersję 98");
                System.out.println("Zrób update");
                break;
            case 99:
                System.out.println("Masz aktualna wersję");
                break;
            default:
                System.out.println("twoja wersja chrome, nie jest wspierania");
        }



    }
}
