class Solution1137 {
    public static int tribonacci(int n) {
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int tn = 0;
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else {
            for (int i = 2; i < n; i++) {
                tn = t0 + t1 + t2;
                t0 = t1;
                t1 = t2;
                t2 = tn;
            }
            return tn;
        }

    }
    public static void main(String[] args) {
        for(int i =25;i<26;i++) {
            System.out.println(tribonacci(i));
        }
    }
}