import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {
        String filePath = "d:/example.txt";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

