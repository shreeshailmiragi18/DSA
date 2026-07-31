class Solution {
    public int totalWaviness(int num1, int num2) {
int count = 0;

for(int num = num1; num <= num2; num++){

    ArrayList<Integer> arr = new ArrayList<>();

    int temp = num;

    while(temp > 0){
        arr.add(temp % 10);
        temp /= 10;
    }

    for(int i = 1; i < arr.size()-1; i++){

        if(arr.get(i) > arr.get(i-1)
                && arr.get(i) > arr.get(i+1))
            count++;

        else if(arr.get(i) < arr.get(i-1)
                && arr.get(i) < arr.get(i+1))
            count++;
    }
}

return count;
    }
}