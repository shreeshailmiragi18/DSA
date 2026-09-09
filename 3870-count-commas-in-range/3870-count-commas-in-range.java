class Solution {
    public int countCommas(int n) {

        int count = 0;

        int start = 1000;  // First number that needs a comma
        int commas = 1;

        while (start <= n) {

            int end = start * 1000 - 1;

            // Don't go beyond n
            int limit = Math.min(n, end);

            // Number of numbers in this range
            int numbers = limit - start + 1;

            // Each number has 'commas' commas
            count += numbers * commas;

            // Move to the next comma level
            start *= 1000;
            commas++;
        }

        return count;
    }
}