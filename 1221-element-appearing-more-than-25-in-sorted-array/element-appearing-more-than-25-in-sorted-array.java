class Solution {
    public int findSpecialInteger(int[] arr) {
        // Use a TreeMap to count the occurrences of each element in the array
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        // Iterate through the array and update the counts in the TreeMap
        for (int i = 0; i < arr.length; i++) {
            tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
        }
        
        int value = 0;
        int ans = 0;
        
        // Iterate through the TreeMap to find the element with more than 25% occurrence
        for (Integer it : tm.keySet()) {
            if (tm.get(it) >= value) {
                value = tm.get(it);
                ans = it;
            }
        }
        
        return ans;
    }
}