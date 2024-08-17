import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class FileDelete {
    public static void main(String[] args) {
        List<String> files=Arrays.asList("d:/example.txt","d:/example1.txt","d:/exmaple2.txt");
        for(String file:files){
            Path filename=Paths.get(file);
        }
        try{
            Files.delete(filename);
            System.out.println("file"+file+" deleted successfully");

        }
        catch(IOException e){
            System.out.println("An error occurred while deleting the file"+e.getMessage());
        }


    }

    
}
