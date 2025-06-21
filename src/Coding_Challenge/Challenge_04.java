package Coding_Challenge;
import java.util.Scanner;
public class Challenge_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input
        int i = scanner.nextInt();
        System.out.println("Orignal:" +i);
         //Pre- increment

        int preInc = ++i;
        System.out.println("Pre-Increment:" +preInc);

        //Post- Increment

        int postInc = i++;
        System.out.println("Post- Increment:" +i+ "(returned "+postInc+")");

        // Pre-decrement

        int preDec = --i;
        System.out.println("Pre-decrement: " + preDec);

        // Post-decrement

        int postDec = i--;
        System.out.println("Post-decrement: " + i + " (returned " + postDec + ")");

    }
}
