class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int num2 = 0;
        int l = (int) (Math.log10(x) + 1);
        if(x>=0) {
            for (int i = 1; i <= l; i++) {
                int z = x % 10;
                x = x / 10;
                num2 = num2 * 10 + z;
            }
            if (y == num2) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}