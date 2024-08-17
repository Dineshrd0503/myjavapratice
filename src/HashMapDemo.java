import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<String, Integer>(7);
        
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.replace("one", 5);
        for(String i:map.keySet())
    {

        System.out.println("key is "+i+" value is "+map.get(i));
    }        
    System.out.println("checking for key three");
    boolean r=map.containsKey("three");
    System.out.println(r);
    System.out.println("printing all keys and values");
    for(int i=0;i<map.size();i++){
        System.out.println("key is "+map.keySet().toArray()[i]+" value is "+map.values().toArray()[i]);
    }
    System.out.println("enter size of new hashlist");
    int n=sc.nextInt();
    HashMap<String, Integer> student = new HashMap<String, Integer>(n);  // Create a new hashmap with given size
    System.out.println("enter keys and values for new hashmap in (String-Integer)");
   for (int i = 0; i <n; i++) {
    System.out.println("Enter name for entry " + (i + 1) + ":");
    String name = sc.nextLine();
    System.out.println("Enter age for " + name + ":");
    int age = sc.nextInt();
    sc.nextLine(); // Consume the newline character left by nextInt()

    student.put(name, age);
}
    System.out.println("HashMap after adding new entries:");
    for (String key : student.keySet()) {
        System.out.println("Name: " + key + ", Age: " + student.get(key));
    }
    }
}
