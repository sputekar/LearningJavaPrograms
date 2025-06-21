package Coding_Challenge;

public class Challenge_03 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a == b:" + (a == b));

        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        //logical operators

        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0)));
        System.out.println("!(a > b): " + (!(a > b)));
    }
}
