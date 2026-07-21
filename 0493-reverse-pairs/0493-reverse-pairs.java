class Solution {
    static int count;
    public int reversePairs(int[] nums) {
        count = 0;
        reverse(nums, 0, nums.length-1);
        return count;
    }
    public void inverse(int[] nums, int left, int mid, int right){
        int i = left;
        int j = mid+1;
        while(i<=mid){
            while (j <= right && (long) nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
            i++;
        }
    }

    public void reverse(int[] nums, int left, int right){
        if(right<=left) return;
        int mid = left + (right-left)/2;
        reverse(nums, left, mid);
        reverse(nums, mid+1, right);
        inverse(nums,left,mid,right);
        merge(nums,left,mid,right);
    }
    public void merge(int[] nums, int left, int mid, int right){
        int [] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=right){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }
        while(i<=mid){
            temp[k++] = nums[i++];
        }
        while(j<=right){
            temp[k++] = nums[j++];
        }

        for(int x=  0; x< temp.length; x++){
            nums[left+x] = temp[x];
        }
    }
}