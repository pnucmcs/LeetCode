class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int j=0;j < nums.length;j++){
            if(nums[j]==target){
                return j;
            }else if(nums[j]>target){
                return j;
            }
        }
        return nums.length;
    }
}