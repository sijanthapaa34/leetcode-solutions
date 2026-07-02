class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;

        if (k == 0) return;

        reverse(nums,0,l-k);
        reverse(nums, l-k, l);
        reverse(nums, 0,l);
        
    }
    public void reverse(int[] nums, int i, int j){
       while(i < j){
            int temp = nums[i];
            nums[i] = nums[j-1];
            nums[j-1] = temp;
            i++;
            j--;
        } 
    }
}