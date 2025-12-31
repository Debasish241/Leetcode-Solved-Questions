class Solution {
    public int totalFruit(int[] fruits) {
        int l =0;
        int r = 0;
        int maxLen = 0;
        Map<Integer,Integer>mpp = new HashMap<>();
        while(r<fruits.length){
            mpp.put(fruits[r], mpp.getOrDefault(fruits[r],0) + 1);
            if(mpp.size()>2){
                mpp.put(fruits[l],mpp.get(fruits[l])-1);
                mpp.remove(fruits[l],0);
                l++;
            }
            maxLen=Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}