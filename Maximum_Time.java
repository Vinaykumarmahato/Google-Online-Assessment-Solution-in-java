public class MaximizeTime {

    public static String maximizeTime(String time) {
        char[] timeArray = time.toCharArray();

        // Fill in hours
        if (timeArray[0] == '?' && timeArray[1] == '?') {
            timeArray[0] = '2';
            timeArray[1] = '3';
        } else if (timeArray[0] == '?' && timeArray[1] > '3') {
            timeArray[0] = '1';
        } else if (timeArray[0] == '?' && timeArray[1] <= '3') {
            timeArray[0] = '2';
        } else if (timeArray[1] == '?' && timeArray[0] == '2') {
            timeArray[1] = '3';
        } else if (timeArray[1] == '?' && timeArray[0] < '2') {
            timeArray[1] = '9';
        }

        // Fill in minutes
        if (timeArray[3] == '?') {
            timeArray[3] = '5';
        }
        if (timeArray[4] == '?') {
            timeArray[4] = '9';
        }

        return new String(timeArray);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(maximizeTime("?4:5?")); // Output: "14:59"
        System.out.println(maximizeTime("23:5?")); // Output: "23:59"
        System.out.println(maximizeTime("2?:22")); // Output: "23:22"
        System.out.println(maximizeTime("0?:??")); // Output: "09:59"
        System.out.println(maximizeTime("??:??")); // Output: "23:59"
    }
}
