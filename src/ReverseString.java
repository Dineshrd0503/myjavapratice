import java.util.*;
import java.lang.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to reverse");
        String s=sc.nextLine();
        String rev="";
        System.out.println("using for loop");
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("reversed string using for loop is: "+rev);
        System.out.println("using StringBUilder class"+rev1(s));
        
    }
    public static String rev1(String s){
        StringBuilder sb=new StringBuilder(s).reverse();
        return sb.toString();
    }
    
}
