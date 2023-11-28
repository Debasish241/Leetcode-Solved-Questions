class Solution {
    int pre[];
    public int numberOfWays(String corridor) {
        int n=corridor.length();
        long mod=(long)1e9+7;
        int totalSeats=0;
        pre=new int[n];
        for(int i=0;i<corridor.length();i++){

            if(corridor.charAt(i)=='S')totalSeats++;
        }
        

        if(totalSeats==2)return 1;
        if(totalSeats<=1||totalSeats%2!=0)return 0;
        int count=0;
        long ans=1;
        int cc=1;
        for(int i=0;i<corridor.length();i++){
            if(corridor.charAt(i)=='S'){
                count++;
            }
            if(count==2){
                int j=i+1;
                while(j<n&&corridor.charAt(j)!='S'){
                    j++;cc++;
                }
                
                if(j!=n)ans=((ans%mod)*(cc%mod));
                cc=1;
                i=j-1;
                count=0;
            }

            
        }
        return(int) (ans%mod);
        
    }
    
}