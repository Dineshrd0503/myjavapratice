import java.util.Scanner;
public class FlyodsTriangle {
    public static void main(String[] args) {
        System.out.println("displaying flyods trinagle with natural numbers");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.of rows");
        n = sc.nextInt();
        int n1 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(n1 + " ");
                n1++;
            }
            System.out.println("\n");
        }
    }
}
