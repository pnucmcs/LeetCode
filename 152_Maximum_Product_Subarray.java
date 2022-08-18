class Solution {
    public int maxProduct(int[] nums) {
        int res = maxofanArray(nums);
        int curMin = 1;
        int curMax = 1;
        for( int i = 0; i< nums.length; i++){
            if (nums[i]==0){
                curMax = 1;
                curMin = 1;
            }
            int tmp = curMax*nums[i];
            curMax = Math.max((Math.max(nums[i]*curMax, nums[i]*curMin)), nums[i]);
            curMin = Math.min((Math.min(nums[i]*curMin, tmp)), nums[i]);
            
            res = Math.max(res,curMax);
        }
        return res;
    }
    public static int maxofanArray(int[] nums){
        int largest = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i]> largest)
            largest = nums[i];
        }
        return largest;
    }
}