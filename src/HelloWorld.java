import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! I'm a Java Developer!");
        System.out.println("printing hello worls with print statement");
        try {
            System.out.write("without print statement".getBytes());
            System.out.flush();
        } catch (IOException e) {
            System.err.println("Error writing to output stream: " + e.getMessage());
        }
    }
}