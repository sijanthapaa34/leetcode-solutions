class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate("",n, 0, 0, ans);
        return ans;

    }

    public void generate(String parenthe, int n, int leftSide, int rightSide, List<String> ans){
        if(rightSide==n){
            ans.add(parenthe);
            return;
        }
        if(leftSide<n) generate(parenthe+"(", n, leftSide+1, rightSide,ans );
        if(leftSide>rightSide) generate(parenthe+")", n, leftSide, rightSide+1,ans );

    }
}