class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();
        int left = 0;
        HashSet<Character> ans = new HashSet<>();
        for(int right = 0; right< n; right++){
            while(ans.contains(s.charAt(right))){
                ans.remove(s.charAt(left));
                left++;
            }

            ans.add(s.charAt(right));
            int count = right-left+1;
            if(count >maxLength) maxLength = count;
        }
        return maxLength;
    }
}