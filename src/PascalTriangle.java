import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("printing the pascal triangle for n rows");
        System.out.println("enter no.of rows you want");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = 1; // used to calculate the binomial coefficient
            for (int j = 0; j <= i; j++) {
                System.out.print(n1+ " ");
                n1 = n1 * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
