class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int result = 0;
        
        // dp[i][d] represents the number of arithmetic subsequences ending at index i with common difference d
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            
            for (int j = 0; j < i; j++) {
                long diff = (long)nums[i] - nums[j];
                
                if (diff >= Integer.MAX_VALUE || diff <= Integer.MIN_VALUE)
                    continue;
                
                int d = (int)diff;
                int countJ = dp[j].getOrDefault(d, 0);
                int countI = dp[i].getOrDefault(d, 0);
                
                // Count all arithmetic subsequences ending at index j and add the count to the result
                result += countJ;
                
                // Update the count for subsequences ending at index i with common difference d
                dp[i].put(d, countI + countJ + 1);
            }
        }
        
        return result;
    }
}