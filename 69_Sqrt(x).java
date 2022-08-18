class Solution69 {
    public int mySqrt(int x) {
        if(x==0 || x == 1){
            return x;
        }else {
            double t;
            double squareroot = x / 2;
            do {
                t = squareroot;
                squareroot = (t + (x / t)) / 2;
            }
            while ((t - squareroot) != 0);
            return (int) Math.floor(squareroot);
        }
    }
}