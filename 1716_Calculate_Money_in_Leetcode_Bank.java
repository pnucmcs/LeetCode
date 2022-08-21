class Solution1716 {
    public static int totalMoney(int n) {
        int first_Week = 28;
        int total_weeks = n/7;
        int total_days = n%7;
        return total_weeks*first_Week +7*(total_weeks-1)*total_weeks/2+total_days*total_weeks+(1+total_days)*total_days/2;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(10));
    }
}