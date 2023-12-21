class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b) -> (a[0] - b[0]));
        int max = Integer.MIN_VALUE;
        for(int i = 1 ; i < points.length ; i++){
            int prevX = points[i - 1][0];
            int currX = points[i][0];
            max = Math.max(max,(currX - prevX));
        }
        return max;
    }
}