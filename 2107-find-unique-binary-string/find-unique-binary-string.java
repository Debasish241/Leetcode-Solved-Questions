class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(Integer.parseInt(nums[i],2));
        }
        //Collections.sort(l);
        //System.out.println(l);
        int val = 0;
        for(int i=0;i<l.size();i++){
            if(!l.contains(val))
                break;
            val++;
        }
        //System.out.println(val);
        String s = Integer.toBinaryString(val);
        //System.out.println(s);
        String ex = "";
        if(s.length() != nums.length){
            int diff = Math.abs(s.length()-nums.length);
            for(int i=0;i<diff;i++)
                ex += "0";
        }
        ex += s;
        return ex;
    }
}