class Solution {

    static boolean helper(String s){
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        }
        return true;
    }
    public String firstPalindrome(String[] arr) {

        for(int i=0; i<arr.length; i++){
            if(helper(arr[i])) return arr[i];
        }
        return "";
    }
}