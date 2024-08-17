import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scanner.nextInt();
        System.out.println("checking odd or even using for loop");
        for1(n);
        System.out.println("usingg bitwise or");
        or1(n);
    System.out.println("using bitwise and");     
    and1(n);  
    scanner.close();
    }
    public static void for1(int n){
       if(n%2==0)
       System.out.println(n+" is even");
       else
       System.out.println(n+" is odd");
    }
    public static void or1(int n){
        if((n | 1)>n)
        System.out.println(n+"is even");
        else
        System.out.println(n+"is odd");


    }
    public static void and1(int n){
        if((n & 1)==1)
        System.out.println(n+" is odd");
        else
        System.out.println(n+" is even");
    }
}
