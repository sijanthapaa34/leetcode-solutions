class Solution {
    public List<List<Integer>> generate(int numRows) {
        /* here the value of the i,j is determided by its previous so 
        value(i,j)  = valueOf(i-1,j-1) + valueOf(i-1,j)
        */
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            ans.add(new ArrayList<>());
             for(int j = 0; j<=i; j++){
                if(j == 0 || j== i) ans.get(i).add(j,1);
                else{
                    int val = ans.get(i-1).get(j-1)+ ans.get(i-1).get(j);
                    ans.get(i).add(j,val);
                }
             }
        }
        return ans;
    }
}