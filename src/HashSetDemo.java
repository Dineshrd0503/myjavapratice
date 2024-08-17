import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(9);
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple");
        System.out.println("Original HashSet: " + hashSet);
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Contains 'Apple': " + hashSet.contains("Apple"));
        System.out.println("Removing 'Apple': " + hashSet.remove("Apple"));
        System.out.println("Updated HashSet: " + hashSet);
        for(int i=0;i<hashSet.size();i++){
            System.out.println(hashSet.toArray()[i]);
            

        }

    
}
}