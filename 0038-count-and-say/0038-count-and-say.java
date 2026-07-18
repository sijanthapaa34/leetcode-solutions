class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        String ans = count(s);
        return ans;
    }

    public String count(String s){
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        // for(int right = 1; right< s.length(); right++){
        //     if(s.charAt(left) == s.charAt(right)){
        //         count++;
        //         continue;
        //     }
        //     ans += count;
        //     ans += s.charAt(left);
        //     left = right;
        //     count = 1;
            
        // }
        // ans+= count;
        // ans += s.charAt(left);
        while(j < s.length()){
            while(j < s.length() && s.charAt(i) == s.charAt(j)){
                j++;
            }
            ans.append(j-i).append(s.charAt(i));
            i = j;
        }
        return ans.toString();
    }
}