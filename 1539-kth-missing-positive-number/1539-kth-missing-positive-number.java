class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length-1;
        while(left<= right){
            int mid = left + (right-left)/2;
            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;
            if(k<= missing ) right = mid-1;
            else left = mid + 1;
        }
        return right+1+k;
    }
}