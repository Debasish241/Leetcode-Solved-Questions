class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');
        int c1=0;
        int c2=0;
        int n = s.length();
        for(int i=0; i<n; i++){
            if(i<n/2){
                if(set.contains(s.charAt(i))) c1++;
            }else{
                if(set.contains(s.charAt(i))) c2++;
            }
        }
        return c1==c2;
    }
}