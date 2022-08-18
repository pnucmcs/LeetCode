class Solution {
    static int minimumlength(String[] args){
        int minl=args[0].length();
        for(int i=0; i<args.length;i++){
            if(args[i].length()<minl ) {
                minl = args[i].length();
            }
        }
        return minl;
    }
    public String longestCommonPrefix(String[] strs) {
        int minl = minimumlength(strs);
        if(minl ==0){
            return "";
        }
        for(int i=0; i<strs.length;i++) {
            if (strs[0].charAt(0) != strs[i].charAt(0)) {
                return "";
            }
        }
        String lcp="";
        char current;


        for (int j = 0; j < minl; j++) {
            current = strs[0].charAt(j);
            for(int i=1; i<strs.length;i++) {
                if (strs[i].charAt(j) !=current)  {
                    return lcp;
                }
            }lcp += (current);
        }
        return lcp;
    }
}