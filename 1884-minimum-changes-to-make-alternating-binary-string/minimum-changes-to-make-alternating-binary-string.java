class Solution {
    public int minOperations(String s) {
        int count = 0;
        int evenZeroCount = countReplacement(s, '0', '1');
        int oddZeroCount = countReplacement(s, '1', '0');;
        count = Math.min(evenZeroCount, oddZeroCount);
        return count;
    }

    private int countReplacement(String s, char evenPos, char oddPos){
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(i % 2 == 0) {
                if(ch != evenPos) ans++;
            }
            else if(ch != oddPos) ans++;
        }
       return ans;
    }
}