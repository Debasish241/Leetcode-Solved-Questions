class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int m=1;
        while(true){
            if(n>=7){
                sum+=(2*m+6)*7/2;
                n-=7;
                m++;
            }else if(n==0){
                break;
            }else{
                sum+=(2*m+n-1)*n/2;
                break;
            }
        }
        return sum;
    }
}