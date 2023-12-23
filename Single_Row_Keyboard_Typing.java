public class SingleRowKeyboard {

    public static int calculateTime(String keyboard, String text) {
        int[] indexMap = new int[26];

        for (int i = 0; i < keyboard.length(); i++) {
            char c = keyboard.charAt(i);
            indexMap[c - 'a'] = i;
        }

        int totalTime = 0;
        int currentPos = 0;

        for (char c : text.toCharArray()) {
            int targetPos = indexMap[c - 'a'];
            totalTime += Math.abs(targetPos - currentPos);
            currentPos = targetPos;
        }

        return totalTime;
    }

    public static void main(String[] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxy";
        String text = "cba";
        System.out.println(calculateTime(keyboard, text)); // Output: 4
    }
}
