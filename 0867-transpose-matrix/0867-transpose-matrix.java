class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];
        // for (int k = 0; k < row * col; k++) {
        //     int i = k / col;  rowIndex = linearIndex/col
        //     int j = k % col;  colIndex = linearIndex%col
        //     ans[j][i] = matrix[i][j];
        // }

        for(int i = 0; i < ans.length;i++){
            for(int j = 0;j<ans[0].length;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}