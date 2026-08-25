class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0;i<matrix.length;i++){
            int k = 0, l = matrix.length-1;
            while(k<l){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][l];
                matrix[i][l] = temp;
                k++;
                l--;
            }
        }
    }
}