package Coding_Challenge;

import java.util.Scanner;

public class Challenge_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        int a = scanner.nextInt(); //e,g: 10
        double b = scanner.nextDouble(); //e.g: 3.5

        // Operator precedence demonstration
        // Expression:
        int expressionResult = a + (int)b * 2 + 7;
        System.out.println("Exression result (a + (int)b * 2 + 3): " + expressionResult);

        // Implicit casting: int + double → double
        double implicitCasting = a+b;
        System.out.println("Implicit casting (int + double):" + implicitCasting);

        // Explicit casting: double -> int
        int explicitCasting = (int)(a+b);
        System.out.println("Explicit casting ((int)(a + b)): " + explicitCasting);
    }
}
