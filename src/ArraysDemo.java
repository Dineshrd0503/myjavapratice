import java.util.*;
public class ArraysDemo{
    public static void main(String[] args){
        Comparator<Integer> com=new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10)
                return 1;
                else
                return -1;
            }

        };
List<Integer> list = new ArrayList<Integer>();
list.add(11);
list.add(29);
list.add(3);
list.add(4);
list.add(87);
Collections.sort(list,com);
int sum =list.stream().reduce(0,(a,b) -> a+b);
int[] b={3,4,566,12,40};
int sum1=Arrays.stream(b).reduce(0,(a,b1)->a+b1);


System.out.println(list); 
System.out.println(sum);
System.out.println(sum1);
    }
}