class Solution {
    public int countHomogenous(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
          int j=0;
          int ans=0;
        for(int i=0;i<s.length();i++){
          mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
          while(mp.size()>1){
              mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)-1);
              if(mp.get(s.charAt(j))==0)mp.remove(s.charAt(j));
              j++;
          }
          ans+=(i-j+1)%1000000007;
          ans%=1000000007;
        }
        return ans;
    }
}