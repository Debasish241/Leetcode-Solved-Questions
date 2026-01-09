class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int cSum = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==1){
                cSum++;
                maxCount = Math.max(maxCount,cSum);
            }else{
                cSum=0;
            }
        }
        return maxCount;
    }
}