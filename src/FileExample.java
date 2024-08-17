import java.io.File;
import java.io.IOException;
import java.nio.*;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("d:/thinkchampjava.txt");

        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
            try {
                // Create a new file
                if (file.createNewFile()) {
                    System.out.println("File created");
                } else {
                    System.out.println("File not created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Delete the file
        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("File not deleted");
        }
    }
}
