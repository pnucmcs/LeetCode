import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> allIPaddresses = new ArrayList<>();
        int[] path = new int[4];
        snapshotIP(allIPaddresses, s, 0, path, 0);
        return allIPaddresses;
    }
    private void snapshotIP(List<String> allIPaddresses, String s, int builderIndex, int[] path, int segment){
        if(segment ==4 && builderIndex == s.length()){
            allIPaddresses.add(path[0] + "." + path[1] + "." + path[2] + "." + path[3]);
            return;
        }else if (segment ==4 || builderIndex == s.length()){
            return;
        }
        for(int len = 1; len <= 3 && builderIndex + len <= s.length(); len ++ ){
            String snapshot = s.substring(builderIndex, builderIndex + len);
            int value = Integer.parseInt(snapshot);
            if(value > 255 || len >= 2 && s.charAt(builderIndex) == '0'){
                continue;
            }
            path[segment] = value;
            snapshotIP(allIPaddresses,s,builderIndex + len, path, segment+1);
            path[segment] = -1;
        }
    }
}