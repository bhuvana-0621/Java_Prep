import java.util.*;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int originalNumber = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is Not a Strong Number.");
        }

        sc.close();
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
