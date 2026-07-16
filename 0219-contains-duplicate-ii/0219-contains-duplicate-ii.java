class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        HashSet<Integer> window = new HashSet<>();
        for(int right = 0; right< n; right++){
            if((right- left) > k){
                window.remove(nums[left]);
                left++;
            }
            if(window.contains(nums[right])) return true;

            window.add(nums[right]);
        }
        return false;
    }
}