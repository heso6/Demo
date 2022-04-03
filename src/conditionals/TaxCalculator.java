package conditionals;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dochód:");

        int income = scanner.nextInt();
        double tax = 0;
//        if (x <= 120000 && x > tax) {
//            System.out.println("musisz zapłacić 17% podatku");
//        } else if (x > 120000 && x <= 1000000) {
//            System.out.println("musisz zapłacić 32% podatku");
//        } else if (x > 1000000) {
//            System.out.println("musissz zapłacić 36% podatku");
//        } else if (x == tax) {
//            System.out.println("nie zarobiłes nic, więc nie płacisz podatku");
//        }
//        else {
//            System.out.println("wprowadziłeś ujemną liczbę, wprowadź poprawną liczbę");
//        }


        if (income <= 120000) {
            tax = income * 0.17;
        } else if (income > 120000 && income <= 1000000) {
            tax = 120000 * 0.17 + (income - 120000) * 0.32;
        } else {
            tax = 120000 * 0.17 + 880000 * 0.32 + (income - 1000000) * 0.36;
        }
        System.out.println("podatek do zapłacenia: " + tax);
    }
}
