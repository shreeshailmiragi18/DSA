class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int right = s.length();
        for(int i=0;i < right/2;i++){
            if(s.charAt(i) != s.charAt(right-1-i)){
                return false;
            }
        }
        return true;
    }
}
