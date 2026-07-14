/*
 * Example: nums = [1, 2, 3]
 *
 * Think of every number having 2 choices:
 *      Pick it OR Skip it
 *
 * Recursion Tree:
 *
 *                         []
 *                    /          \
 *                Pick 1        Skip 1
 *                [1]             []
 *              /     \         /     \
 *          Pick2   Skip2   Pick2   Skip2
 *          [1,2]    [1]     [2]      []
 *          /  \     / \     / \      / \
 *         P3  S3   P3  S3  P3  S3   P3  S3
 *
 *      [1,2,3] [1,2] [1,3] [1]
 *      [2,3]   [2]   [3]   []
 *
 * Generated subsets:
 * [1,2,3]
 * [1,2]
 * [1,3]
 * [1]
 * [2,3]
 * [2]
 * [3]
 * []
 *
 * How the code works:
 *
 * 1. Add current number (Pick).
 * 2. Go deeper and process next index.
 * 3. Remove the number (Undo/Backtrack).
 * 4. Go deeper again without taking that number (Skip).
 *
 * Example:
 *
 * []
 * add(1)
 * [1]
 * add(2)
 * [1,2]
 *
 * After exploring all subsets starting with [1,2]:
 *
 * remove(2)
 * [1]
 *
 * Now explore subsets that contain 1 but not 2.
 *
 * Backtracking simply means:
 *      Make a choice
 *      Explore
 *      Undo the choice
 *      Explore another choice
 */
 
 class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> numToAdd = new ArrayList<>();
        subsetRecursion(numToAdd ,0,nums,ans );
        return ans;
    }

    public void subsetRecursion(List<Integer> numToAdd , int idx, int[] nums, List<List<Integer>> ans) {
        if(idx == nums.length){
            ans.add(new ArrayList<>(numToAdd));
            return;
        }  

        numToAdd.add(nums[idx]);          // pick
        subsetRecursion(numToAdd, idx + 1, nums, ans);
        numToAdd.remove(numToAdd.size() - 1);   // backtrack
        subsetRecursion(numToAdd, idx + 1, nums, ans);   // skip
    }

}

