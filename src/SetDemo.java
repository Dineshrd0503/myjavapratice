import java.util.*;
public class SetDemo{
    public static void main(String[] args) {
        Set<Integer> nums=new HashSet<Integer>();
        Random rand=new Random();
        System.out.println("adding elements");
        for(int i=0;i<10;i++){
            int randint=rand.nextInt(100);
            nums.add(randint);
        }
        for(int n:nums){
            System.out.println(n);
        }
        System.out.println("using ietrator");
        Iterator<Integer> it=nums.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("uisng hasset to sort set elements");
        Set<Integer> sorted=new TreeSet<Integer>();
        sorted.addAll(nums);
        System.out.println("orinting using for loop");
        for(int n:sorted)
        System.out.println(n);
        System.out.println("printing using iterator");
        Iterator<Integer> values=sorted.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }







}
}