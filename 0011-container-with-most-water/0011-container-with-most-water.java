class Solution {
    public int maxArea(int[] height) {
        int total = 0;
        int result = 0;
        int len = height.length;
        int l=0,r=len-1;
        while(l<r){
            int min = Math.min(height[l],height[r]);
            total = min * (r-l);
            result = Math.max(result,total);
        
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return result; 
    }
}