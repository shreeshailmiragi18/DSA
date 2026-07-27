class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        for(int i=0;i<matrix.length;i++){
            if(target <= matrix[i][matrix[0].length-1]){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j] == target){
                        result = true;
                    }
                }
            }
        }
        return result;






        // boolean result=false;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j] == target){
        //             result = true;
        //         }
        //     }
        // }
        // return result;
        
    }
}