import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int l = 0; l < nums.length; l++) {
            int complement = target - nums[l];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), l };
            } else {
                map.put(nums[l], l);
            }
        }
        return new int[] {};
    }
}