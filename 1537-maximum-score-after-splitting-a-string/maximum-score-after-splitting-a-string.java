class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int ones = 0;
        int zero = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i)=='0') zero++;
            else ones++;
        } 

        int left = 0;
        int right = 0;
        int ans = 0;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)=='0'){
                left++;
                right = ones;
                ans = Math.max(ans,left+right);
            }else{
                ones--;
                right=ones;
                ans = Math.max(ans,left+right);
            }
        }
        return ans;

    }
}