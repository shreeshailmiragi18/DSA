class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int i=0;
        int j=1;
        int len ;
        while(j<s.length()){
            String sub = s.substring(i,j);
            len = s.length()/sub.length();
            if((sub.repeat(len)).equals(s)){
                return true;
            }
            j++;

        }
        return false;
    }
}