import java.lang.*;
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("dinesh");
        System.out.println("capacity is "+sb.capacity());
        System.out.println("converting stringbuffer to string");
        String s=sb.toString();
        System.out.println("string is "+s.getClass().getName());
        System.out.println("stringbuffer is "+sb.getClass().getName());
        sb.append(" kumar");
        System.out.println("after appending string kumar "+sb+"capacity is "+sb.capacity());
        System.out.println("deleting char at index 4");
        sb.deleteCharAt(4);
        System.out.println("after deleting char at index 4 "+sb);
        System.out.println("replacing char at index 2 with g");
        sb.replace(2,3,"g");
        System.out.println("after replacing char at index 2 with g "+sb);
        System.out.println("checking for substring gk");
        boolean b=sb.toString().contains("gk");
        System.out.println("substring gk is present "+b);
        System.out.println("reversing stringbuffer");
        sb.reverse();
        System.out.println("after reversing "+sb);
        System.out.println("ensuring min capacity of stringbuffer as 100");
        sb.ensureCapacity(100);
        System.out.println("capacity after ensuring min capacity "+sb.capacity());
    }
}
