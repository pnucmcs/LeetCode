import java.util.HashMap;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)){
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}