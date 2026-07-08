class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length , col = matrix[0].length;
        int fR = 0, lC = col-1, lR = row-1, fC = 0;
        List<Integer> ans = new ArrayList<>();
        while(fR <= lR && fC <= lC){
            for(int i = fC; i <= lC; i++){
                ans.add(matrix[fR][i]);
            }
            fR++;
            if(fR > lR || fC>lC) break;
            for(int i = fR; i <= lR; i++){
                ans.add(matrix[i][lC]);
            }
            lC--;
            if(fR > lR || fC>lC) break;
            for(int i = lC; i >= fC; i--){
                ans.add(matrix[lR][i]);
            }
            lR--;
            if(fR > lR || fC>lC) break;
            for(int i = lR; i>=fR; i--){
                ans.add(matrix[i][fC]);
            }
            fC++;
        }
        return ans;
    }
}