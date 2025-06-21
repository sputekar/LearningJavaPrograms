package Coding_Challenge;
import java.util.Scanner;

public class Challenge_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers from input
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Arithmetic operations
        System.out.println("\n=== Arithmetic Operations ===");
        System.out.println("Addition:        " + (a + b));
        System.out.println("Subtraction:     " + (a - b));
        System.out.println("Multiplication:  " + (a * b));
        System.out.println("Division:        " + (a / b));
        System.out.println("Modulus:         " + (a % b));

        // Assignment operations
        System.out.println("\n=== Assignment Operations ===");
        int c = a;  // simple assignment
        System.out.println("c = a → c:       " + c);

        c += b;     // equivalent to c = c + b
        System.out.println("c += b → c:      " + c);

        c = a;      // reset to original
        c -= b;     // equivalent to c = c - b
        System.out.println("c -= b → c:      " + c);

        c = a;      // reset to original
        c *= b;     // equivalent to c = c * b
        System.out.println("c *= b → c:      " + c);

        c = a;      // reset to original
        c /= b;     // equivalent to c = c / b
        System.out.println("c /= b → c:      " + c);

        sc.close();
    }
}

