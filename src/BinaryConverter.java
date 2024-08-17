import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Binary representation of " + number + " is: " + convertToBinary(number));
    }
    
    public static String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.append(number % 2);
            number /= 2;
        }
        return binary.reverse().toString();
    }
    
}