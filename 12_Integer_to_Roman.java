class Solution {
    public static String intToRoman(int num) {
        int n = (int) (Math.log10(num) + 1);
        int incr = 1;
        String s = "";
        for(int i = 0; i<n; i++){
            int temp = (num%10)*incr;
            if(temp == 1)
                s= "I"+s;
            if(temp == 2)
                s= "II"+s;
            if(temp == 3)
                s= "III"+s;
            if(temp == 4)
                s= "IV"+s;
            if(temp == 5)
                s= "V"+s;
            if(temp == 6)
                s= "VI"+s;
            if(temp == 7)
                s= "VII"+s;
            if(temp == 8)
                s= "VIII"+s;
            if(temp == 9)
                s= "IX"+s;
            if(temp == 10)
                s= "X"+s;
            if(temp == 20)
                s= "XX"+s;
            if(temp == 30)
                s= "XXX"+s;
            if(temp == 40)
                s= "XL"+s;
            if(temp == 50)
                s= "L"+s;
            if(temp == 60)
                s= "LX"+s;
            if(temp == 70)
                s= "LXX"+s;
            if(temp == 80)
                s= "LXXX"+s;
            if(temp == 90)
                s= "XC"+s;
            if(temp == 100)
                s= "C"+s;
            if(temp == 200)
                s= "CC"+s;
            if(temp == 300)
                s= "CCC"+s;
            if(temp == 400)
                s= "CD"+s;
            if(temp == 500)
                s= "D"+s;
            if(temp == 600)
                s= "DC"+s;
            if(temp == 700)
                s= "DCC"+s;
            if(temp == 800)
                s= "DCCC"+s;
            if(temp == 900)
                s= "CM"+s;
            if(temp == 1000)
                s= "M"+s;
            if(temp == 2000)
                s= "MM"+s;
            if(temp == 3000)
                s= "MMM"+s;
            num = num/10;
            incr = incr*10;
        }
        return s;
    }
    public static void main(String[] args) {
        String s1 = intToRoman(3);
        System.out.println(s1);
    }
}
