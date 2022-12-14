import java.util.HashMap;
class Solution13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        int l = s.length();
        for(int i =l-1; i>=0;i--){
            if(i>0 && map.get(s.charAt(i-1))<map.get(s.charAt(i))){
                sum = sum +map.get(s.charAt(i))-map.get(s.charAt(i-1));
                i--;
            }else{
                sum = sum + map.get(s.charAt(i));
            }
        }
        return sum;
    }
}