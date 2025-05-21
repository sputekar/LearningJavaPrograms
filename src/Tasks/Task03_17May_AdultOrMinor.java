package Tasks;

public class Task03_17May_AdultOrMinor  {
    public static void main(String[] args) {
        int age = 45; // You can change this value to test

        String category = (age < 18) ? "Minor"
                : (age > 65) ? "Senior"
                : "Adult";

        System.out.println("You are an " + category + ".");
    }
}


