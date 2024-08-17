import java.io.IOException;
import java.util.Scanner;
import java.util.Formatter;

public class AsciiDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("demonstrating ascii conversions");
        while(true){
            System.out.println("Enter a character:");
            int ch = System.in.read();
            System.out.println("using brute force");
            System.out.println("ASCII value of " +char(ch) + " is " + ch);
            System.out.println("using format specefire ");
            Formatter formatter = new Formatter();
            formatter.format("%d",ch);
            System.out.println("ASCII value of " + (char)ch + " is " + formatter.toString());
            sc.nextLine();
            formatter.close();
            sc.close();
            
            
        }
    }
    
}
