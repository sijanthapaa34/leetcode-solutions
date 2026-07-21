class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> unique = new HashSet<>();
        // for(int i = 0; i< nums.length; i++){
        //     if(unique.contains(nums[i])) return nums[i];
        //     else unique.add(nums[i]);
        // }
        // return -1;

        //cyclic sort
        int i = 0;

        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                if (i != correctIndex) {
                    return nums[i];
                }
                i++;
            }
        }

        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}