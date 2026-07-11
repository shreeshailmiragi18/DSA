class Solution {
    public int findKthPositive(int[] arr, int k) {
        int currentMissingCount = 0;
        int i = 0;
        int currentNum = 1;

        while (currentMissingCount < k) {
            if (i < arr.length && arr[i] == currentNum) {
                i++;
            } else {
                currentMissingCount++;
                if (currentMissingCount == k) {
                    return currentNum;
                }
            }
            currentNum++;
        }
        return currentNum;
    }
}
