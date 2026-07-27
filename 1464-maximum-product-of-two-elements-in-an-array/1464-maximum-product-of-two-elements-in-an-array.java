class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                max = Math.max(max, (nums[i]-1) * (nums[j]-1));
            }
        }
        return max;
        // int n = nums.length;
        // Arrays.sort(nums);
        // int product = (nums[n-1]-1) * (nums[n-2] -1);
        // return product;
    }
}