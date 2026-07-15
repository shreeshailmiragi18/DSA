
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n*n;
        int evenSum = n*(n+1);
        int result = 0;
        // for(int i=1; i<=n*2; i++){
        //     if(i%2 == 0){
        //         evenSum += i;
        //     }else{
        //         oddSum += i;
        //     }
        // }
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