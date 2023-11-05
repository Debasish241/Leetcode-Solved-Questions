class Solution {
    public int getWinner(int[] arr, int k) {
       
        int ele=arr[0];
        int win=0;
       for(int i=1;i<arr.length;i++){
           if(ele<arr[i]){
               win=0;
               ele=arr[i];
           }
               if(++win==k)
               break;
       }
       return ele;
        
    }
}