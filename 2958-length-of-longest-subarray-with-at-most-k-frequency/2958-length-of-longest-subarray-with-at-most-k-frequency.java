class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right= 0;right<nums.length;right++){
            if(map.containsKey(nums[right])){
                map.put(nums[right],map.get(nums[right])+1);
            }else{
                map.put(nums[right],1);
            }

            while(map.get(nums[right]) > k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            result = Math.max(result, right-left+1);
        }
        return result;
    }
}