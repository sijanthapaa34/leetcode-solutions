class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long sum = n*(n+1)/2;
        long currentS = 0;
        for(int ele: nums){
            currentS += ele;
        }

        return (int)(sum-currentS);
    }
}