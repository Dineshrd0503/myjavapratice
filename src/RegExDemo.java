import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog. The dog barks.";

        // Compile the pattern
        Pattern pattern = Pattern.compile("\\b[Tt]he\\b");
        
        // Create a matcher
        Matcher matcher = pattern.matcher(input);
        
        // Using find() method
        System.out.println("Using find() method:");
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group() + " at position: " + matcher.start());
        }
        
        // Using matches() method
        matcher = pattern.matcher("The"); // Reset matcher with new input
        System.out.println("\nUsing matches() method:");
        if (matcher.matches()) {
            System.out.println("The entire string matches the pattern.");
        } else {
            System.out.println("The entire string does not match the pattern.");
        }
        
        // Using lookingAt() method
        matcher = pattern.matcher(input);
        System.out.println("\nUsing lookingAt() method:");
        if (matcher.lookingAt()) {
            System.out.println("The string starts with a match.");
        } else {
            System.out.println("The string does not start with a match.");
        }
        
        // Using replaceAll() method
        String replaced = matcher.replaceAll("A");
        System.out.println("\nUsing replaceAll() method:");
        System.out.println("Replaced text: " + replaced);
        
        // Using replaceFirst() method
        matcher = pattern.matcher(input);
        String replacedFirst = matcher.replaceFirst("A");
        System.out.println("\nUsing replaceFirst() method:");
        System.out.println("Replaced text: " + replacedFirst);
        
        // Using split() method
        Pattern splitPattern = Pattern.compile("\\s+");
        String[] words = splitPattern.split(input);
        System.out.println("\nUsing split() method:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
