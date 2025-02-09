class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        long bp=0;
        for(int i=0;i< nums.length;i++){
            int key= i - nums[i];
            int gp = map.getOrDefault(key, 0);
            int total = i;
            map.put(key, gp + 1);
            bp+= total - gp;
        }
        return bp;
    }
}