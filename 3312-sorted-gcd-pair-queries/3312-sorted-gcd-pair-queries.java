class Solution {

    public int[] gcdValues(int[] nums, long[] queries) {

        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        // freq[i] = frequency of number i
        int[] freq = new int[max + 1];
        for (int num : nums) {
            freq[num]++;
        }

        // divisibleCount[i] = numbers divisible by i
        long[] divisibleCount = new long[max + 1];

        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                divisibleCount[i] += freq[j];
            }
        }

        // exactPairs[i] = number of pairs having gcd exactly i
        long[] exactPairs = new long[max + 1];

        for (int i = max; i >= 1; i--) {

            long cnt = divisibleCount[i];

            // total pairs divisible by i
            exactPairs[i] = cnt * (cnt - 1) / 2;

            // subtract pairs already counted with larger gcd
            for (int j = i * 2; j <= max; j += i) {
                exactPairs[i] -= exactPairs[j];
            }
        }

        // prefix[i] = total pairs with gcd <= i
        long[] prefix = new long[max + 1];

        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1] + exactPairs[i];
        }

        int[] ans = new int[queries.length];

        for (int k = 0; k < queries.length; k++) {

            long target = queries[k] + 1;

            int left = 1;
            int right = max;

            while (left < right) {

                int mid = left + (right - left) / 2;

                if (prefix[mid] >= target) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            ans[k] = left;
        }

        return ans;
    }
}