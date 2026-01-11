class Solution {
    public int centeredSubarrays(int[] nums) {
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            HashSet<Integer> f = new HashSet<>();
            for(int j = i,s=0;j<nums.length;j++){
                f.add(nums[j]);
                s=s+nums[j];
                if(f.contains(s)){
                    ans ++;
                }
            }
        }
        return ans;
    }
}