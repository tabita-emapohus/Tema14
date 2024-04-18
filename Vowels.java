
import java.util.HashSet;

public class Vowels {
    public static boolean containsAllVowels(String str) {
       
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (char v : str.toCharArray()) {

            if (vowels.contains(v)) {
                vowels.remove(v);
            }
        }

        return vowels.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(containsAllVowels("The quick brown fox jumps over the lazy dog")); 
        System.out.println(containsAllVowels("Hello, World!"));
    }
}
