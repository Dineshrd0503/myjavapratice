import java.util.*;
import java.util.stream.Stream;
public class ForEachMethod {
    public static void main(String[] args) {
        System.out.println("crrating a list uisng aslist in arrays");
        List<Integer> list = Arrays.asList(55,8,1,47,36);
        List<Integer> list1=new ArrayList<>();
        list1.add(55);
        list1.add(8);
        list1.add(80);
        list1.add(19);
        List<Integer> newlist=new ArrayList<>();
        newlist.addAll(list);
        System.out.println("list is "+list);
        System.out.println("sorting using bubble sort");
        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-i-1;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);

        }
    }
    
    
}
System.out.println("uisng comparator to sort as per last digit");
Comparator<Integer> com = (i, j) -> i%10>j%10?1:-1;
Collections.sort(list, com);
list.forEach(n -> System.out.println(n));
System.out.println("displaying sorted list");
    System.out.println(list);
System.out.println("suing for each method on dupliacted list");
newlist.forEach(n-> System.out.println(n));
System.out.println("suing for each method on a array list");
list1.forEach(n_->System.out.println(n_));
System.out.println("using stream api");
Stream<Integer> s1=list.stream();
s1.forEach(System.out::println);
}
}
