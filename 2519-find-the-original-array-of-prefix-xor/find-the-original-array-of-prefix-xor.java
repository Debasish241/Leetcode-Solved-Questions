class Solution {
    public int[] findArray(int[] pref) {
        int len=pref.length;
        int ans[]=new int[len];
        ans[0]=pref[0];

        for(int i=1,curr=ans[0];i<len;i++){
            ans[i]=curr^pref[i];
            curr=curr^ans[i];
        }
        return ans;
    }
}