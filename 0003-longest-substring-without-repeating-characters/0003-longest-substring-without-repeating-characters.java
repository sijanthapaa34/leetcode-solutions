class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] word = s.toCharArray();
        ArrayList<Character> sub = new ArrayList<Character>();
        int max=0;
        for(int i = 0; i<word.length;i++){
            sub.clear();
            sub.add(word[i]);
            for (int j = i+1;j<word.length;j++){
                if(!sub.contains(word[j])){
                    sub.add(word[j]);
                }else{
                    break;
                }
            }
            if(sub.size()>max){
                max= sub.size();
            }
        }
        
        return max;
    }
}