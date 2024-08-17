import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        // Create an ArrayList to store Integer objects
        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing: Automatically converting int to Integer
        numbers.add(10); // int 10 is autoboxed to Integer 10
        numbers.add(20);
        numbers.add(30);

        // Explicitly creating Integer objects
        // Adding Integer objects to the ArrayLis
        // Displaying the ArrayList using a for-each loop
        System.out.println("Numbers in the ArrayList:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Unboxing: Automatically converting Integer to int
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Integer num is unboxed to int
        }
        System.out.println("Sum of numbers: " + sum);

        // Using utility methods of the wrapper classes
        String numStr = "123";
        int numFromStr = Integer.parseInt(numStr); // Convert String to int
        System.out.println("Parsed number from string: " + numFromStr);

        String numToStr = Integer.toString(456); // Convert int to String
        System.out.println("Converted number to string: " + numToStr);
    }
}
