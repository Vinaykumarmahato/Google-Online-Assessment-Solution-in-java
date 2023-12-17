import java.util.Arrays;

public class ServerLoadBalancer {

    public static int minAbsoluteDifference(int[] loads) {
        Arrays.sort(loads); // Sort the array to simplify the distribution process

        int totalLoadServer1 = 0;
        int totalLoadServer2 = 0;

        // Distribute processes to servers starting from the heaviest load
        for (int i = loads.length - 1; i >= 0; i--) {
            if (totalLoadServer1 <= totalLoadServer2) {
                totalLoadServer1 += loads[i];
            } else {
                totalLoadServer2 += loads[i];
            }
        }

        // Calculate the absolute difference of server loads
        return Math.abs(totalLoadServer1 - totalLoadServer2);
    }

    public static void main(String[] args) {
        int[] processes = {1, 2, 3, 4, 5};
        int result = minAbsoluteDifference(processes);
        System.out.println("Minimum Absolute Difference of Server Loads: " + result);
    }
}
