class Solution {
    /*public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        TreeSet ts = new TreeSet();
        for (int l = 0; l < nums.length; l++) {
            int x = nums[l];
            ts.add(x);

            }
        Object[] objArray = ts.toArray();
        int p = 0;
        for (int l = 0; l < ts.size(); l++) {
            nums[l] = (Integer)objArray[l];
        }
        return ts.size();
    }*/
    //program using pointer method.
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int count =1;
        for (int j=1;j < nums.length;j++){
            if(nums[j]!=nums[j-1]){
                i++;
                nums[i]=nums[j];
                count++;
            }
        }
        return count;
    }
}