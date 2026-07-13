class Solution {
    public boolean containsDuplicate(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}