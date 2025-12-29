class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while(r < s.length()){
            if(map.containsKey(s.charAt(r))){
                l = Math.max(l,map.get(s.charAt(r)) + 1);
            }

            int len = r - l+ 1;
            maxLen = Math.max(len,maxLen);
            map.put(s.charAt(r),r);
            r++;
        }
        return maxLen;
    }
}