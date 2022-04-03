package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchException {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj twój wiek:");
        try {
            int age = scanner.nextInt();
            System.out.println("Twoj wiek to: " + age);
        } catch (InputMismatchException e) {
            System.out.println("Wybacz, ale podałes tekst zamiast liczby");
        }


    }


}
