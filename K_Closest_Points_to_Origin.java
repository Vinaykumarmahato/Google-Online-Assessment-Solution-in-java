class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int ans[][] = new int[k][2];
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<points.length;i++){
            int arr[] = new int[2];
            arr[0] = i;
            arr[1] = (int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2);
            q.add(arr);
        }
        for(int i=0;i<k;i++){
            int temp[] = q.poll();
            ans[i] = points[temp[0]];
        }
        return ans;
    }
}
