class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long current = 0;
        int left = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int right = 0; right < nums.length;right++){
            while(set.contains(nums[right]) || set.size() == k){
                set.remove(nums[left]);
                current -= nums[left];
                left++;
            }
            current += nums[right];
            set.add(nums[right]);
            if(set.size() == k){
                max = Math.max(current,max);
            }
        }
        return max;

    }
}