class Solution {
    public int maxProduct(int[] nums) {
        int[] maxs = new int[] {nums[0], Integer.MIN_VALUE};
      
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > maxs[1]) {
                
                if (nums[i] > maxs[0]) {

                    maxs[1] = maxs[0];
                    maxs[0] = nums[i];

                } else maxs[1] = nums[i];
            }
        }

        return --maxs[0] * --maxs[1];
    }
}