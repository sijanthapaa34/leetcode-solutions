class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        int left = searchLeft(nums, target, lo, hi);
        int right = searchRight(nums, target, lo, hi);
        return new int[]{left, right};
    }
    public int searchLeft(int[] nums, int target, int lo, int hi) {
        if(hi<lo) return -1;

        int mid = lo + (hi-lo)/2;

        if(nums[mid] == target){
            if (mid == 0 || nums[mid-1] != target) return mid;
            return searchLeft(nums, target, lo, mid-1);

        }
        else if(nums[mid] >target) return searchLeft(nums, target, lo, mid-1); 
        else return searchLeft(nums, target, mid+1, hi);
        // return new int[]{f, l};
    }
    public int searchRight(int[] nums, int target, int lo, int hi) {
        if(hi<lo) return -1;

        int mid = lo + (hi-lo)/2;

        if(nums[mid] == target){
            if (mid == hi  || nums[mid+1] != target) return mid;
            return searchRight(nums, target, mid+1, hi);
        }
        else if(nums[mid] >target) return searchRight(nums, target, lo, mid-1); 
        else return searchRight(nums, target, mid+1, hi);
    }
}