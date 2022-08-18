
class Solution {
    /*public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return x;
        else if (n > 0)
            return x * myPow(x, n - 1);
        return 1 / (x * myPow(x, abs(n)-1));
    }*/
    /*public static String decToBinary(int n) {
        String s ="";
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                s = s+"1";
            else
                s = s+"0";
        }
        return s;
    }*/
    public static double myPow(double x, int n) {
        long j = -1*(long)n;
        if (n == 0)
            return 1;
        else if (n == 1)
            return x;
        else if(n>0){
            String binarystr = String.valueOf(toBinary(n));
            double sq= x;
            double multi =1;
            for(int i = binarystr.length()-1; i>=0; i--){
                int p = binarystr.charAt(i) - '0';
                if(p==1){
                    multi = multi*sq;
                }
                sq=sq*sq;
            }return multi;
        }else{
            String binarystr = String.valueOf(toBinary(j));
            double sq= x;
            double multi =1;
            for(int i = binarystr.length()-1; i>=0; i--){
                int p = binarystr.charAt(i) - '0';
                if(p==1){
                    multi = multi*sq;
                }
                sq=sq*sq;
            }return 1/multi;
        }
    }
    public static StringBuilder toBinary(long num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(num % 2);
            num = num / 2;
        }
        return sb.reverse();
    }
    public static void main(String[] args) {
        double y = myPow(2.00000, 5);
        System.out.println(y);
        //toBinary(2147483648);
    }
}