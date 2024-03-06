class Solution {
    public int minimumLength(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(ch1==ch2){
                while(l<=r&&ch1==s.charAt(l)){
                    l++;
                }
                while(l<=r&&ch2==s.charAt(r)){
                    r--;
                }
            }else{
                break;
            }
        }
        return r-l+1;
    }
}