
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;
        int result = 0;
        for(int i=1; i<=n; i++){
            evenSum+=1;
            oddSum += 2;
        }
        result = gcd(oddSum, evenSum);
        return result;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}