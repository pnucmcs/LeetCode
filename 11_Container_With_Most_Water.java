/* Brute Force
class Solution {
    public static int maxArea(int[] height) {
        int res = 0;
        for(int i =0; i < height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int area = (j-i)*Math.min(height[i],height[j]);
                res = Math.max(res, area);
            }
        }        
        return res;
    }
    public static void main(String[] args) {
        int[] h1 = {1,8,6,2,5,4,8,3,7};
        int[] h2 = {1,1};
        System.out.println(maxArea(h1));
        System.out.println(maxArea(h2));
    }
}

 */
class Solution11 {
    public static int maxArea(int[] height) {
        int res = 0;
        int l=0,r=height.length-1;
        while(l<r){
            int area = (r-l)*Math.min(height[r],height[l]);
            res = Math.max(res, area);
            if(height[l]<height[r]){
                l++;
            }
            else {
                r--;
            }
        }       
        return res;
    }
    public static void main(String[] args) {
        int[] h1 = {1,8,6,2,5,4,8,3,7};
        int[] h2 = {1,1};
        System.out.println(maxArea(h1));
        System.out.println(maxArea(h2));
    }
}