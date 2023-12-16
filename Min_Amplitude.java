import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterSplit {

    public static int countWaysToSplit(String s) {
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            String s1 = s.substring(0, i);
            String s2 = s.substring(i);

            int uniqueCharsS1 = countUniqueChars(s1);
            int uniqueCharsS2 = countUniqueChars(s2);

            if (uniqueCharsS1 == uniqueCharsS2) {
                count++;
            }
        }

        return count;
    }

    private static int countUniqueChars(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        return uniqueChars.size();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countWaysToSplit("aaaa")); // Output: 3
        System.out.println(countWaysToSplit("bac"));  // Output: 0
        System.out.println(countWaysToSplit("ababa")); // Output: 2
    }
}
