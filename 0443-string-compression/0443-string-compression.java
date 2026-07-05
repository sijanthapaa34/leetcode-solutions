class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int n = chars.length;
        int idx =0;
        while(i<n){
            int j = i;
            while(j < n && chars[i] == chars[j]){
                j++;
            } 
            int totalNo = j-i;
            chars[idx] = chars[i];
            if(totalNo!=1){
                String count = String.valueOf(totalNo);
                for (char c : count.toCharArray()) {
                    chars[++idx] = c;
                }
            }
            idx++;
            i = j;
        }
        return idx;
    }
}