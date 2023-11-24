class Solution {
    public int maxCoins(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int i=0, j=arr.length-1;
        while(i < j){
            count += arr[j-1];
            j = j-2;
            i++;
        }
        return count;
    }
}
