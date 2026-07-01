class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };
        
        // map.put(1000, "M");
        // map.put(900, "CM");
        // map.put(500, "D");
        // map.put(400, "CD");
        // map.put(100, "C");
        // map.put(90, "XC");
        // map.put(50, "L");
        // map.put(40, "XL");
        // map.put(10, "X");
        // map.put(9, "IX");
        // map.put(5, "V");
        // map.put(4, "IV");
        // map.put(1, "I");

        // StringBuilder sb = new StringBuilder();


        // for (int value : values) {
        //     while (num >= value) {
        //         sb.append(map.get(value));
        //         num -= value;
        //     }
        // }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(num >= values[i]){
                sb.append(symbol[i]);
                num-= values[i];
            }
        }

        return sb.toString();
    }
}