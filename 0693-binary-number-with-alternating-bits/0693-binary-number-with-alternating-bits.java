class Solution {
    public boolean hasAlternatingBits(int n) {
       
       StringBuilder binary = new StringBuilder();
       int right = 1;
       int left = 0;

       while(n>0){
        binary.append(n%2);
        n=n/2;
       }
       binary.reverse();

       while(right < binary.length() && left < right){
        if(binary.charAt(left) == binary.charAt(right)){
            return false;
        }else{
            left++;
            right++;
        }
       }
       return true;
       
       
       
       
       
       
       
       
       
        // String binary = Integer.toBinaryString(n);
        // int left = 0;
        // int right = 1;
        // while(right < binary.length() && left < right){
        //     if(binary.charAt(left) == binary.charAt(right)){
        //         return false;
        //     }else{
        //         right++;
        //         left++;
        //     }
        // }
        // return true;
    }
}