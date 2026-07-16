class Solution {
    public int[] decrypt(int[] code, int k) {
        int sum = 0;
        int n = code.length;
        int [] ans = new int[n];

        if (k == 0) return ans;

        if(k>0){
            for(int i = 1; i<= k;i++){
            sum+= code[i%n];
            }
            ans[0] = sum;
            int left = 1;
            int right = k+1;
            for(int i = 1; i< n; i++){
                sum+= code[right%n];
                sum-= code[left%n];
                ans[i] = sum;
                left ++;
                right ++;
            }
        }
        else{
            for(int i = n+k; i<= n-1;i++){
                sum+= code[i%n];
            }
            ans[0] = sum;
            int left = n+k;
            int right = 0;
            for(int i = 1; i< n; i++){
                sum+= code[right%n];
                sum-= code[left%n];
                ans[i] = sum;
                left ++;
                right ++;
            }
        }
        return ans;
    }
}