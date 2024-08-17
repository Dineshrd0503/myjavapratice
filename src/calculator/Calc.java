package calculator;
import calculator.hi;
import java.lang.*;
import java.util.Scanner;
class cal1 extends hi{
    public int mul(int a,int b){
        return a*b;
    }
    public double div(double a,double b){
        return a/b;
    }
    public double pow(double a,double b){
        return Math.pow(a,b);
    }
    public double rem(double a,double b){
        return a%b;
    }
}

public class Calc {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    cal1 c1=new cal1();
    System.out.println("sum of numbers is "+c1.add(a, b));
    System.out.println("product of numbers is"+c1.mul(a, b));
    System.out.println("division of numbers is"+c1.div(a, b));
    System.out.println("power of numbers is"+c1.pow(a, b));
    System.out.println("difference is"+c1.sub(a, b));
    System.out.println("remainder is "+c1.rem(a, b));
     
}
}
