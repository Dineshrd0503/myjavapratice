import java.util.*;
public class LInkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();
        LinkedList<Integer> num = new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.println("enter the "+i+" element");
            num.add(sc.nextInt());
        }
        System.out.println("The linked list is: "+num);
        System.out.println("size of list is "+num.size());
        System.out.println("dsiplaying vaues using get method");
        for(int i=0;i<n;i++)
            System.out.println("value at "+i+" is "+num.get(i));
        System.out.println("displaying va;lues uisng iterator");
        Iterator<Integer> it=num.iterator();
        while(it.hasNext())
        System.out.println(it.next());

            sc.close();
    }
}