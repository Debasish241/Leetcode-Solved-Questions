class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> resedu= new HashSet<>();
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            resedu.add(s.charAt(i));
            if(resedu.size() == (i + 1) % 3){
                ans++;
            }
        }
        return ans;
    }
}