import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int square=n*n;
        int t=n;
        int sum=0;
        while(square>0){
            int r=square%10;
            sum=sum+r;
            square=square/10;
        }
        if(n==sum)
        System.out.println(sum+" is noen number");
        else
        System.out.println(t+" is not a neon number");
        sc.close();
    
}
}