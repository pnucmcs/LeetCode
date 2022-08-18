class Solution33 {
    public static int search(int[] nums, int target) {
        int l= 0;
        int r = nums.length-1;
        while(l<=r){
            int mid = (int) Math.floor((l+r)/2);
            if(target == nums[mid])
                return mid;
            if(nums[l]<=nums[mid]){
                if(target > nums[mid] || target < nums[l]){
                    l = mid+1;
                }else {
                    r = mid-1;
                }
            }
            else {
                if(target < nums[mid] || target > nums[r]){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] h1 = {4,5,6,7,0,1,2};
        int t = 0;
        System.out.println(search(h1,t));
    }
}