import java.util.*;
public class ArrayLists{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("demosntraitng lists in jvaa");
        System.out.println("enter size of list");
        int n=sc.nextInt();
        ArrayList<String> fruits = new ArrayList<>(n);
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        int size=fruits.size();
        System.out.println("size is"+size);
        System.out.println("fruits are"+fruits);
        System.out.println("element at index 1 is"+fruits.get(1));
        System.out.println("adding a new elemnt at index 3");
        fruits.add(3,"mango");
        fruits.set(2,"papaya");
        System.out.println("fruits are"+fruits);
        System.out.println("cretaing arraylit with inetgers");
        int n1=sc.nextInt();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<n1;i++){
            System.out.println("enter the "+i+"elemnt");
            num.add(i,sc.nextInt());
        }
    System.out.println("displaying elemnts in list");
        for(int n2:num){
            System.out.print(n2+" ");
        }
    System.out.println("dispaying values using get method");
    for(int i=0;i<n1;i++){
        System.out.println("element at index"+i+" is"+num.get(i));

    }
    }

}