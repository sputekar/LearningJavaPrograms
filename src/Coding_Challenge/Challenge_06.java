package Coding_Challenge;
import java.util.Scanner;
public class Challenge_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read Input from user

        System.out.println("Enter and Integer:");
        int number = scanner.nextInt();

        //check if the number is positive, negative, or Zero

        if (number > 0){
            System.out.println("The number is a positive.");

        } else if (number < 0){
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }


        }

}
