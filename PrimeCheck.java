import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 и меньше — не простые
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("Число " + number + " является простым.");
        } else {
            System.out.println("Число " + number + " не является простым.");
        }

        scanner.close();
    }
}