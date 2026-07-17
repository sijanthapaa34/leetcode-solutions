class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int maxSum = 0;
        HashSet<Integer> ans =  new HashSet<>(); 
        for(int right = 0; right < n; right++){
            while(ans.contains(nums[right])){
                ans.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            ans.add(nums[right]);
            sum+= nums[right];
            if(sum>maxSum) maxSum = sum;
        }
        return maxSum;
    }
}