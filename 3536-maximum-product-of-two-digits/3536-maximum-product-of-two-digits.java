class Solution {
    public int maxProduct(int n) {
        int largest = -1;
        int SecondLargest = -1;
        while( n > 0){
            int current = n % 10;
            if(current > largest){
                SecondLargest = largest;
                largest = current;
            }else if(current > SecondLargest){
                SecondLargest = current;
            }

            n = n/10;
        }
        return largest * SecondLargest;








        //Brute force
        //  ArrayList<Integer> arr = new ArrayList<>();

        // while(n>0){
        //     arr.add(n%10);
        //     n = n/10;
        // }
        // Collections.sort(arr);
        // int max = arr.get(arr.size()-2) * arr.get(arr.size()-1);
        // return max;


        //Brute force
        // ArrayList<Integer> arr = new ArrayList<>();

        // while(n>0){
        //     arr.add(n%10);
        //     n = n/10;
        // }
        // int max = 0;
        // for(int i=0;i<arr.size()-1;i++){
        //     for(int j=i+1;j<arr.size();j++){
        //         max = Math.max(max,arr.get(i) * arr.get(j));
        //     }
        // }
        // return max;
    }
}