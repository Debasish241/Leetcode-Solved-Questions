class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // int i =nums[0];
        // int j = nums[n-1];
        // int sum = i + j;
        // while(i<j){
        //     if(sum == target){
        //         return new int[]{i,j};
        //     }
        // }
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}