import java.util.Scanner;
public class Complex {
    public static void main(String[] args) {
        int real,image;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part of the complex number");
        real=sc.nextInt();
        System.out.println("enter thecomplex part of the number");
        image=sc.nextInt();
        System.out.println("diplaying complex number");
        complex1(real,image);
        sc.close();
    }
public static void complex1(int a,int b){
    System.out.println(a+"+i"+b);
    
}
}