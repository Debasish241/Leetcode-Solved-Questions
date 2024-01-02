class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int x : nums) {
            arr[x]++;
        }

        List<List<Integer>> res = new ArrayList();

        while(true) {
            List<Integer> al = new ArrayList();

            int j = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    al.add(i);
                    arr[i]--;
                } else {
                    j++;
                }
            }


            if (j == arr.length) {
                break;
            }

            res.add(new ArrayList(al));
        }

        return res;
    }
}