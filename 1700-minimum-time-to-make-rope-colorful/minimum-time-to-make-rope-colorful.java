class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int prev = 0;
        int curr = 1;
        
        while (curr < colors.length()) {
            if (colors.charAt(prev) == colors.charAt(curr)) {
                if (neededTime[prev] <= neededTime[curr]) {
                    totalTime += neededTime[prev];
                    prev = curr;
                }
                else {
                    totalTime += neededTime[curr];
                }
            }
            else {
                prev = curr;
            }
            
            curr++;
        }
        
        return totalTime;
    }
}