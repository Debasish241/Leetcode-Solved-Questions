class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int[] charCount = new int[3];

        for(int i = 0;i< s.length();i++){
            charCount[s.charAt(i)-'a']++;

            while(charCount[0] > 0 && charCount[1] > 0 && charCount[2] > 0){
                count+= s.length() - i;
                charCount[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }
}