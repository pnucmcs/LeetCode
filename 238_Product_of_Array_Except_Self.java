class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int prefix = 1;
        for(int k = 0; k < nums.length; k++){
            output[k] = prefix;
            prefix*= nums[k];
        }

        int postfix = 1;
        for(int i = nums.length -1; i>=0; i--){
            output[i] *= postfix;
            postfix*= nums[i];
        }

        return output;
    }
}