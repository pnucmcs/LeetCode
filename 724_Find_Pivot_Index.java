class Solution724 {
    public static int pivotIndex(int[] nums) {
        int pre[] = prefixsum(nums);
        int pos[] = postfixsum(nums);
        for(int i =0; i <nums.length;i++){
                if(pre[i]==pos[i]){
                    return i;
                }
        }
        return -1;
    }
    public static int[] prefixsum(int[] nums) {
        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }return prefixSum;
    }
    public static int[] postfixsum(int[] nums) {
        int postfixSum[] = new int[nums.length];
        postfixSum[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >=0; --i) {
            postfixSum[i] = postfixSum[i+1] + nums[i];
        }return postfixSum;
    }
    public static void printarray(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] d = {2,1,-1};
        printarray(prefixsum(d));
        printarray(postfixsum(d));
        System.out.println(pivotIndex(d));

    }
}