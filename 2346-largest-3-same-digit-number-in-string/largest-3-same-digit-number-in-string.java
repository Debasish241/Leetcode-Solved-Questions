class Solution {
    public String largestGoodInteger(String num) {
        String res = "999";
        String ans = "";
        for(int i=0;i<10;i++){
            
            if(num.contains(res)){
                ans = res;
                break;
            }
            else{
                res = String.valueOf(Integer.parseInt(res)-111);
                
                if(res.equals("0"))
                    res = "000";
            }

        }
        return ans;
    }
}