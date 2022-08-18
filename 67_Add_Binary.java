class Solution67 {
    public String addBinary(String a, String b) {
        String sum = sum(a, b);
        return sum;
    }
    public static String sum(String b1, String b2) {
        int len1 = b1.length();
        int len2 = b2.length();
        int carry = 0;
        String res = "";
        int maxLen = Math.max(len1, len2);
        int p = 0;
        int q = 0;
        for (int i = 0; i < maxLen; i++) {
            if(i<len1){
                p = b1.charAt(len1 - 1 - i) - '0';
            }else{
                p=0;
            }
            if(i<len2){
                q = b2.charAt(len2 - 1 - i) - '0';
            }else{
                q=0;
            }
            int temp = p + q + carry;
            carry = temp / 2;
            res = temp % 2 + res;
        }
        if(carry!=0) {
            res = '1' + res;
        }
        return res;
    }
}