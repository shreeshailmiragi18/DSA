class Solution {

    public void reverse(int len, int[] nums){

        int k = len + 1;
        int s = nums.length - 1;

        while(k < s){

            int temp = nums[k];
            nums[k] = nums[s];
            nums[s] = temp;

            k++;
            s--;
        }
    }

    public void nextPermutation(int[] nums) {

        int pivotIndex = -1;

        // Find Pivot if pivot element found do not continue
        for(int i = nums.length-2; i >= 0; i--){

            if(nums[i] < nums[i+1]){
                pivotIndex = i;
                break;
            }
        }

        // if pivot element not found reverse the array
        if(pivotIndex == -1){
            reverse(-1, nums);
            return;
        }

        // Find next greater element and swap the elements
        for(int j = nums.length-1; j > pivotIndex; j--){

            if(nums[j] > nums[pivotIndex]){

                int temp = nums[j];
                nums[j] = nums[pivotIndex];
                nums[pivotIndex] = temp;

                break;
            }
        }

        // Reverse suffix
        reverse(pivotIndex, nums);
    }
}