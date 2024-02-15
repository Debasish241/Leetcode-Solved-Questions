class Solution {
    public long largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    long sum = 0;
    for (int n : nums) sum += n;
    for (int i = nums.length - 1; i >= 2; i--) {
        if (nums[i] < sum - nums[i]) return sum;
        sum -= nums[i];
    }
    return -1;
}
}