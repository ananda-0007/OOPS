// Program Title: Fibonacci Sequence using Recursion
// Aim: To print the Fibonacci sequence up to the nth term using recursion

import java.util.Scanner;

public class FibonacciRecursion {

    // Recursive function to calculate Fibonacci number
    static int fib(int n) {
        if (n == 0) return 0;   // Base case
        if (n == 1) return 1;   // Base case
        return fib(n - 1) + fib(n - 2); // Recursive relation
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        // Step 3: Loop from 0 to n and print each fib(i)
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }

        sc.close();
    }
}