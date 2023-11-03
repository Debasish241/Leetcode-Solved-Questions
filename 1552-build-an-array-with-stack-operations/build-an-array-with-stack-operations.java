class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> al=new ArrayList<>();
        int k=0;
        for(int i=1;i<=n;i++){
            if(k<target.length){
                al.add("Push");
                if(target[k] != i){
                    al.add("Pop");
                }else{
                    k++;
                }
            }else{
                break;
            }
            
        }
        return al;
    }
}