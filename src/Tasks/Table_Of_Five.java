package Tasks;

public class Table_Of_Five {
    public static void main(String[] args) {
        int num = 5;
                for (int i = 1; i <= 10; i++){
                    System.out.printf("%2d * %2d = %2d\n", num, i, num * i);
                }
    }
}
