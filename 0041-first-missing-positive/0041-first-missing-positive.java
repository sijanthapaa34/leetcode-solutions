class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correctIdx = nums[i]-1;
            if(correctIdx > n-1) i++;
            else if(nums[i]<= 0 || nums[i] == i+1 || nums[i] == nums[correctIdx]) i++;
            else swap(nums, i, correctIdx);
        }
        for(i = 0; i<n;i++){
            if(nums[i] != i+1) return i+1;
        }
        return  i+1;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}