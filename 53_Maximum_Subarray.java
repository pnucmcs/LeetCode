import java.util.Arrays;

class Solution53 {
    public int maxSubArray(int[] nums) {
    int maxsum =0;
    int maxcurrsum = 0;
    if(nums.length==1){
        return nums[0];
    }
        //for negative arrays
        int count=0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]<=0){
                count++;
            }
        }
        if(count==nums.length){
            int maxneg = Arrays.stream(nums).max().getAsInt();
            return maxneg;
        }

    for(int i = 0; i<nums.length;i++){
        maxcurrsum += nums[i];
        if(maxcurrsum<0){
            maxcurrsum = 0;
        }if(maxsum<maxcurrsum){
            maxsum=maxcurrsum;
        }
    }
        return maxsum;
    }
}
