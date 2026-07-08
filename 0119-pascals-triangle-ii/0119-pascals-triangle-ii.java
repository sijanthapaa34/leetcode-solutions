class Solution {
    public List<Integer> getRow(int rowIndex) {
        // List<List<Integer>> ans = new ArrayList<>();
        // for (int i = 0; i<= rowIndex; i++){
        //     ans.add(new ArrayList<>());
        //     for(int j = 0;j <= i;j++){
        //         if(j == 0 || j == i) ans.get(i).add(1);
        //         else{
        //             int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
        //             ans.get(i).add(val);
        //         }
        //     }
        // }

        // return ans.get(rowIndex);


/*      Time using Binomial Coefficient (Fastest)
        Each element is
        C(n,k)
        Formula:
        C(n,k)=C(n,k−1)× n−k+1 / k 
*/
        List<Integer> row = new ArrayList<>();

        long value = 1;

        for (int k = 0; k <= rowIndex; k++) {
            row.add((int) value);
            value = value * (rowIndex - k) / (k + 1);
        }

        return row;
    }
}