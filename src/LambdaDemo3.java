
import java.util.*;
import java.util.stream.Stream;

public class LambdaDemo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum is " + sum);
        Stream<Integer> s1=numbers.stream();
        Stream<Integer> s2=numbers.stream();

        System.out.println("uisng lambda for filtering even numbers ");
        s1.filter(x->x%2==0).forEach(System.out::println);
        System.out.println("uisng lambda for filtering odd numbers ");
        s2.filter(x ->x%2!=0).forEach(System.out::println);


    }

}
