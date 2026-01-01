class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int [] freq = new int[26];
        int maxF = 0;
        int maxLen = 0;

        for(int r = 0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            maxF = Math.max(maxF,freq[s.charAt(r)-'A']);
            int length = r-l+1;
            if((length-maxF)>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            length = r-l+1;
            maxLen = Math.max(maxLen,length);
        }
        return maxLen;
    }
}