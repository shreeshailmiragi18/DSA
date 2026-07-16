class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int max = nums[0];
        int smallest = 0;
        int largest = prefixGcd.length-1;
        long sum = 0;

        for(int j=0; j<n; j++){
            if(nums[j] > max){
                max = nums[j];
            }
            prefixGcd[j] = gcd(nums[j],max);
        }

        Arrays.sort(prefixGcd);

        while(smallest < largest){
           sum += gcd(prefixGcd[smallest], prefixGcd[largest]);
           smallest++;
           largest--;
        }
        return sum;
    }

    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
}