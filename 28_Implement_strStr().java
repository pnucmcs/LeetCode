class Solution28 {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        if(n==0) {
            return 0;
        }
        if(n>h){
            return -1;
        }
        char first = needle.charAt(0);
        char last = needle.charAt(n-1);
        for(int j=0; j<h-n+1; j++){
            if(haystack.charAt(j)==first && haystack.charAt(j+n-1)==last){
                int k = j;
                int l =0;
                while (k<(j+n-1) && l<n){
                    if(haystack.charAt(k)==needle.charAt(l)){
                        k++;
                        l++;
                    }else{
                        break;
                    }
                }
                if(l+1==n){
                    return j;
                }
            }
        }
        return -1;
    }
}
