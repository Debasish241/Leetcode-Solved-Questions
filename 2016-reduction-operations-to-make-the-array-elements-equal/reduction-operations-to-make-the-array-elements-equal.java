class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int opCount = 0;
        
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                opCount += (nums.length-i);
            }
        }
        return opCount;
    }
}