import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        System.out.println("adding two numerical strings");
        System.out.println("enter two strings");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println("adding by converting to int and reforming to string");
        add(a, b);
        System.out.println("using inbuilt java string methods");
        String result = a.concat(b);
        System.out.println();
        System.out.println("sum of" + a + " " + b + " " + "is " + result);
        sc.close();
    }

    public static void add(String a, String b) {
        int n1 = Integer.parseInt(a, 2);
        int n2 = Integer.parseInt(b, 2);
        int sum = n1 + n2;
        String result = Integer.toBinaryString(sum);
        System.out.println("sum of" + a + " " + b + " " + "is " + result);
    }

}
