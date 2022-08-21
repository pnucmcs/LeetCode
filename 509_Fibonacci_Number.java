class Solution509 {
    public static int fib(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else {
            for (int i = 1; i < n; i++) {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
            return num3;
        }
    }

    public static void main(String[] args) {
        for(int i =0;i<35;i++) {
            System.out.println(fib(i));
        }
    }
}