class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '*'){
                result.append(s.charAt(i));
            }else{
                result.deleteCharAt(result.length()-1);
            }
        }
        return result.toString();





        // Stack<Character> stack = new Stack<>();
        // StringBuilder result = new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i) != '*'){
        //         stack.push(s.charAt(i));
        //     }else{
        //         stack.pop();
        //     }
        // }
        // while(!stack.isEmpty()){
        //     result.append(stack.pop());
        // }
        // return result.reverse().toString();
    }
}