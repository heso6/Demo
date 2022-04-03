package arrays;

public class Salary {

    public static void main(String[] args) {

        int[] salary = {250, 400, 1000, 133, 200};
        float sum = 0;
        float avg = 0f;
        int max = salary[0];
        int min = salary[0];

        for (int i = 0; i < salary.length; i++) {

            sum += salary[i];
            avg = sum / salary.length;

            if (salary[i] > max) {
                max = salary[i];
            }

            if (salary[i] < min) {
                min = salary[i];
            }

        }
        System.out.println(salary[2]);
        System.out.println("suma tablicy to: " + sum);
        System.out.println("średnia tablicy to: " + avg);
        System.out.println("Liczba max z tablicy to: " + max);
        System.out.println("Liczba min z tablicy to: " + min);

    }
}
