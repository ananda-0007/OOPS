// Prime Number Checker
import java.util.Scanner;

class PrimeCheck {
    int n;

    void performOperations() {
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }
        System.out.println(n + " is a prime number");
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeCheck obj = new PrimeCheck();

        System.out.print("Enter a number: ");
        obj.n = sc.nextInt();

        obj.performOperations();
        sc.close();
    }
}
