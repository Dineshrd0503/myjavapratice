@FunctionalInterface
interface A {
    public int show(int i, int j);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        A obj = (i, j) -> i+j;
        int result=obj.show(8, 9); // Assign the returned value to a variable
         // Print the result
         System.out.println(result);
    }
}