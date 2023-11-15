class Solution {
    public int countPalindromicSubsequence(String s) {
        char[] c = s.toCharArray();
        boolean[] v = new boolean[26];
        int a=0, t=0;

        int l, r;
        for(char x='a'; x<='z'; x++){
            // find the first occurance from left
            for(l=0; l<c.length && c[l]!=x; l++);
                if(l==c.length)
                    continue;

            //find the first occurance from right
            for(r=c.length-1; r>=0 && c[r]!=x; r--);
                if(l>=r)
                    continue;

            //set all values to false
            Arrays.fill(v, false); t=0;
            
            for(int i=l+1; i<r; i++){
                // if not visited then increment t else dont
                if(!v[c[i]-'a']) {

                    v[c[i]-'a']=true;
                    t++;
                    
                    if(t==26)
                        break;

                }
            }

            a+=t;
        }
        return a;
    }
}