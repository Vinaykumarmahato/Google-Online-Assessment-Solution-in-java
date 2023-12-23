import java.util.Arrays;

public class MinimumChairs {

    public static int minChairs(int[] S, int[] E) {
        int n = S.length;
        int[] arrivalTimes = Arrays.copyOf(S, n);
        int[] departureTimes = Arrays.copyOf(E, n);

        Arrays.sort(arrivalTimes);
        Arrays.sort(departureTimes);

        int chairsNeeded = 0;
        int maxChairs = 0;
        int arrivalIndex = 0;
        int departureIndex = 0;

        while (arrivalIndex < n) {
            if (arrivalTimes[arrivalIndex] < departureTimes[departureIndex]) {
                chairsNeeded++;
                maxChairs = Math.max(maxChairs, chairsNeeded);
                arrivalIndex++;
            } else {
                chairsNeeded--;
                departureIndex++;
            }
        }

        return maxChairs;
    }

    public static void main(String[] args) {
        int[] S = {1, 2, 6, 5, 3};
        int[] E = {5, 5, 7, 6, 8};
        System.out.println(minChairs(S, E)); // Output: 3
    }
}
