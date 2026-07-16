class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            }else{
                map1.put(s.charAt(i),1);
            }
        }

        for(int j=0;j<t.length();j++){
            if(map2.containsKey(t.charAt(j))){
                map2.put(t.charAt(j),map2.get(t.charAt(j))+1);
            }else{
                map2.put(t.charAt(j),1);
            }
        }

        return map1.equals(map2);
 













        // HashMap<Character,Integer> map = new HashMap<>();
        // if(s.length() != t.length()){
        //     return false;
        // }

        // for(int i=0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), map.get(s.charAt(i))+1);
        //     }else{
        //         map.put(s.charAt(i),1);
        //     }
            
        // }

        // for(int i=0;i<t.length();i++){
        //     if(!map.containsKey(t.charAt(i))){
        //         return false;
        //     }

        //     map.put(t.charAt(i), map.get(t.charAt(i))-1);

        //     if(map.get(t.charAt(i)) < 0)
        //         return false;
        // }
        // return true;
    }
}