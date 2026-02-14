class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int Row = matrix.length-1;
        int Col = 0;
        while(Row>=0 && Col<matrix[0].length){
            if(target==matrix[Row][Col]){
               return true;
            }
            else if(target>matrix[Row][Col]){
                Col++;
            }
            else{
                Row--;
            }
        }
        return false;
    }
}