public class DominoRotations {

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int result = Math.min(
                Math.min(minRotations(tops[0], tops, bottoms, n), minRotations(bottoms[0], tops, bottoms, n)),
                Math.min(minRotations(tops[0], bottoms, tops, n), minRotations(bottoms[0], bottoms, tops, n))
        );

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private static int minRotations(int target, int[] arr1, int[] arr2, int n) {
        int rotations = 0;

        for (int i = 0; i < n; i++) {
            if (arr1[i] != target && arr2[i] != target) {
                return Integer.MAX_VALUE;
            } else if (arr1[i] != target) {
                rotations++;
            }
        }

        return rotations;
    }

    public static void main(String[] args) {
        int[] tops1 = {2, 1, 2, 4, 2, 2};
        int[] bottoms1 = {5, 2, 6, 2, 3, 2};
        System.out.println(minDominoRotations(tops1, bottoms1)); // Output: 2

        int[] tops2 = {3, 5, 1, 2, 3};
        int[] bottoms2 = {3, 6, 3, 3, 4};
        System.out.println(minDominoRotations(tops2, bottoms2)); // Output: -1
    }
}
