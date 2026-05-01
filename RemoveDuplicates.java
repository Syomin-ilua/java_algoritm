import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "abc abc ab abc ab acs acs";
        
        String[] words = input.split("\\s+");
        
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        
        String result = String.join(" ", uniqueWords);
        System.out.println(result);
    }
}
