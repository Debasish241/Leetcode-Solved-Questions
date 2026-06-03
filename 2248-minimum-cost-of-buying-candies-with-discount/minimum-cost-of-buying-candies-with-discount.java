class Solution {
    public int minimumCost(int[] cost) {
        
        if(cost.length == 1) return cost[0];
        if(cost.length ==2) return cost[0]+cost[1];
        
        Arrays.sort(cost);
        int ans = 0;
        for(int i = cost.length - 1;i>=0;i--){
            if((cost.length - 1 - i) % 3 != 2){
                ans+=cost[i];
                // i++;
            }
        }
        return ans;
    }
}