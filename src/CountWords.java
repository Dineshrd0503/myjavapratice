import java.util.*;
public class CountWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("counting no.of words in sentemce");
        System.out.println("no.of words in "+sentence +"are "+countwords(sentence));
        System.out.println("no.of letters are "+countletters(sentence));
    }
    public static int countwords(String sentence){
        String[] words=sentence.split("\\s+");
        return words.length;
    }
    public static int countletters(String sentence){
        return sentence.replaceAll("\\s+","").length();
    }
    
}
