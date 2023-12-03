class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        int x=points[0][0];
        int y=points[0][1];
        for(int i=0;i<points.length;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            ans+=Math.max(Math.abs(x1-x),Math.abs(y1-y));
            x=x1;
            y=y1;
        }
        return ans;
    }
}