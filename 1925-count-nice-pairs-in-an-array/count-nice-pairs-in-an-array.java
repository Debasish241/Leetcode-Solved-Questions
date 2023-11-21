class Solution {
    public int countNicePairs(int[] nums) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        int mod=(int)1e9+7;
        for(int x:nums){
            int cur=x-rev(x);
            int ans=map.getOrDefault(cur,0);
            count=(count+ans) % mod;
            map.put(cur,map.getOrDefault(cur,0)+1);
        }
        return count % mod;
    }
    public int rev(int n){
        int ans=0;
        while(n!=0){
            int temp=n%10;
            ans=ans*10+temp;
            n/=10;
        }
        return ans;
    }
}