class Solution {
    public int maxProduct(int n) {
        //Brute force
        ArrayList<Integer> arr = new ArrayList<>();

        while(n>0){
            arr.add(n%10);
            n = n/10;
        }
        int max = 0;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                max = Math.max(max,arr.get(i) * arr.get(j));
            }
        }
        return max;
    }
}