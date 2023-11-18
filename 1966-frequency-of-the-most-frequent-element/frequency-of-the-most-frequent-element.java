class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, best = 1, left = n - 1, right = n - 1, total = 0, windowSize = 0; 

        while (left >= 0){
            while (left >= 0) {
                total += nums[left--];
                windowSize++;
                if (windowSize * nums[right] - total <= k) best = Math.max (best, right - left);
                else break;
            }

            while(windowSize * nums[right] - total > k){
                total -= nums[right--];
                windowSize--;
            }
            best = Math.max (best, right - left);
        }
        return best;
    }
}