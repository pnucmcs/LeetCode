class Solution58 {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        if(l==1){
            return 1;
        }
        int count2 = 0;
        for (int i = l - 1; i >= 0; i--) {
            if(s.charAt(i)==' ') {
            }
            if(s.charAt(i)!=' ')
                count2++;
            if(count2>0){
                if(s.charAt(i)==' ')
                    break;
            }
        }
        return count2;
    }
}