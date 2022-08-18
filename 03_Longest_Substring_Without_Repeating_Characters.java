import java.util.HashSet;
import java.util.Set;
class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> map = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxlen = 0;
        while(j<s.length()){
            if(!map.contains(s.charAt(j))){
                map.add(s.charAt(j));
                maxlen = Math.max(map.size(),maxlen);
                j++;
            }else {
                map.remove(s.charAt(i));
                i++;
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Solution3 obj = new Solution3();
        String x = "ab";
        int l = obj.lengthOfLongestSubstring(x);
        System.out.println(l);
        //System.out.println(x.charAt(0));
    }
}