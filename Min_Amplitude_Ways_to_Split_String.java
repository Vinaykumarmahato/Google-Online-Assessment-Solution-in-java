import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AmplitudeAndStringSplit {

    // Problem 1: Minimum Amplitude
    public static int minAmplitude(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        
        // Check the four possible options
        int option1 = A[n - 1] - A[3];
        int option2 = A[n - 2] - A[2];
        int option3 = A[n - 3] - A[1];
        int option4 = A[n - 4] - A[0];
        
        return Math.min(Math.min(option1, option2), Math.min(option3, option4));
    }

    // Problem 2: Number of Ways to Split String
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
        // Test cases for Problem 1
        int[] array1 = {-1, 3, -1, 8, 5, 4};
        int[] array2 = {10, 10, 3, 4, 10};

        System.out.println("Problem 1:");
        System.out.println("Output for array1: " + minAmplitude(array1)); // Output: 2
        System.out.println("Output for array2: " + minAmplitude(array2)); // Output: 0

        // Test cases for Problem 2
        String str1 = "aaaa";
        String str2 = "bac";
        String str3 = "ababa";

        System.out.println("\nProblem 2:");
        System.out.println("Output for str1: " + countWaysToSplit(str1)); // Output: 3
        System.out.println("Output for str2: " + countWaysToSplit(str2)); // Output: 0
        System.out.println("Output for str3: " + countWaysToSplit(str3)); // Output: 2
    }
}
