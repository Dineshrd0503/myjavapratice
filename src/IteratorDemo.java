import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class IteratorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Creating an arrayList");
        System.out.println("Enter the size of the arrayList:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        ArrayList<Integer> list=new ArrayList<>(size);

        System.out.println("Adding elements to the list:");
        for (int i = 0; i < size; i++) {
            System.out.println("Add element of type inetger for index " + i + ":");
            Integer value = sc.nextInt();
            list.add(value);
        }

        System.out.println("Displaying using for-each loop:");
        for (int item : list) {
            System.out.println("Value is: " + item);
        }

        

        System.out.println("Using iterator:");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("Value is: " + itr.next());
        }

        System.out.println("Creating an linkedList");
        System.out.println("Enter the size of the linkedList:");
        int size1 = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        LinkedList<Integer> list1=new LinkedList<Integer>();

        System.out.println("Adding elements to the list:");
        for (int i = 0; i < size1; i++) {
            System.out.println("Add element of type inetger for index " + i + ":");
            Integer value1 = sc.nextInt();
            list1.add(value1);
        }

        System.out.println("Displaying using for-each loop:");
        for (int item : list1) {
            System.out.println("Value is: " + item);
        }

        System.out.println("Using iterator:");
        Iterator<Integer> itr1 = list1.iterator();
        while (itr1.hasNext()) {
            System.out.println("Value is: " + itr1.next());
        }

    }
}
