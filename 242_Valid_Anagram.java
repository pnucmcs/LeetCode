import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean x = sortString(s).equals(sortString(t));
        return x;
    }
    public static String sortString(String inputString){
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}