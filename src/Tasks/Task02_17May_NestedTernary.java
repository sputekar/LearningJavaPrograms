package Tasks;

public class Task02_17May_NestedTernary {
    public static void main(String[] args) {
        int N1 = 10;
        int N2= 20;
        int N3= 30;
        int max = (N1 > N2) ? (N1 > N3 ? N1 : N3) : (N2 > N3 ? N2 : N3);

        System.out.println("Give me maximum between the 3 nos:" + max);
    }
}
