class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        int left = 0;
        int right = 1;
        while(right < binary.length() && left < right){
            if(binary.charAt(left) == binary.charAt(right)){
                return false;
            }else{
                right++;
                left++;
            }
        }
        return true;
    }
}