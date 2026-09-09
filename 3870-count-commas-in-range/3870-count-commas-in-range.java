class Solution {
    public int countCommas(int n) {

        int count = 0;

        int start = 1000;
        int commas = 1;

        while (start <= n) {
            int end = start * 1000 - 1;
            int limit = Math.min(n, end);
            int numbers = limit - start + 1;
            count += numbers * commas;
            start *= 1000;
            commas++;
        }

        return count;
    }
}