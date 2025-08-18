class Solution {
    public int[][] transpose(int[][] matrix) {
        int cols= matrix[0].length;
        int rows= matrix.length;
        
        int [][] mat1= new int[cols][rows];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                mat1[j][i]= matrix[i][j];
            }
        }

        return mat1;
    }
}