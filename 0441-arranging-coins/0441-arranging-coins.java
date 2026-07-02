class Solution {
    public int arrangeCoins(int n) {
        long m = (long)n;
        return (sqrt(8*m+1)-1)/2;
        
    }
    public int sqrt(long x) {
        if (x == 0) return 0;

        long left = 1;
        long right = x;
        int idx = 0;
        while(left<=right){
            long mid = left + (right-left)/2;
            if(mid > x/mid){
                right = mid-1;
            }else{
                idx = (int)mid;
                left = mid+1;
            }
        }
        return idx;
    }

    /*
    The number of coins required to build k complete rows is:
    1 + 2 + 3 + ... + k = k(k + 1) / 2
    So we need to find the largest k such that:
    k(k + 1) / 2 <= n
    Expanding:
    k² + k - 2n <= 0
    Using the quadratic formula:
    k = (-1 + √(1 + 8n)) / 2
    Since we need the largest integer k, we take the floor:
    k = floor((√(8n + 1) - 1) / 2)
    */



}