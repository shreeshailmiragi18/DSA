class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++; // Move forward if not alphanumeric
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--; // Move backward if not alphanumeric (Fixed bug #1)
            } else {
                // If they don't match, it is definitively NOT a palindrome
                if (s.charAt(left) != s.charAt(right)) {
                    return false; 
                }
                // If they match, move both pointers inward to check next chars
                left++;
                right--;
            }
        }
        // If the loop finishes without returning false, it IS a palindrome
        return true; 
    }
}
