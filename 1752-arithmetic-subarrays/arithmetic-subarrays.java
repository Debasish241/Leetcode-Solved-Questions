class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int n=l.length;
        ArrayList<Boolean>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int[] sub = Arrays.copyOfRange(nums,l[i],r[i]+1);
            Arrays.sort(sub);
            if(r[i]-l[i]==0){
                list.add(false);
                continue;
            }
            int flag=0;
            int diff=sub[1]-sub[0];
            for(int j=1;j<sub.length;j++){
                if(sub[j]-sub[j-1]!=diff){
                    list.add(false);
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                list.add(true);
            }
        }
        return list;
    }
}