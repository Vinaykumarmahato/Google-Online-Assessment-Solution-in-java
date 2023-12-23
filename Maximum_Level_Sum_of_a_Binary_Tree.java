/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int level = 0;
        List<Integer> sumArr = new ArrayList<>();
        sumArr.add(root.val);
        sumOfLevel(queue, sumArr,level + 1);
        int result = -1;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < sumArr.size(); i++) {
            if (sumArr.get(i) > sum) {
                sum = sumArr.get(i);
                result = i;
            }
        }
        return result + 1;
    }

     private void sumOfLevel(Queue<TreeNode> queue,List<Integer> sumArr, int level) {
        if (queue.isEmpty()) {
            return;
        }
        Queue<TreeNode> lowQueue = new ArrayDeque<>();
        int sum = 0;
        boolean allElementNull = true;
        while (!queue.isEmpty()) {
            TreeNode element = queue.poll();
            if (element.left != null) {
                allElementNull = false;
                sum += element.left.val;
                lowQueue.add(element.left);
            }
            if (element.right != null) {
                allElementNull = false;
                sum += element.right.val;
                lowQueue.add(element.right);
            }
        }
        if (allElementNull) {
            sumArr.add(Integer.MIN_VALUE);
        } else {
            sumArr.add(sum);
        }
        sumOfLevel(lowQueue, sumArr,level + 1);
    }
}
