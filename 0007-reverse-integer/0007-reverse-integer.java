class Solution {
    public int reverse(int x) {
        boolean isNeg = x<0;
        long n = Math.abs(x);
        
        // String str = String.valueOf(Math.abs(x));
        // char[] chars = str.toCharArray();
        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i<chars.length; i++){
        //     sb.append(chars[chars.length-i-1]);

        // }
        // long result = Long.parseLong(sb.toString());

        // if(isNeg)
        //     result = -result;
        // if(Integer.MIN_VALUE>result || result>Integer.MAX_VALUE)
        //     return 0;
        
        // return (int) result;

        long newDigit = 0;
        while(n>0){
            newDigit *= 10;
            newDigit += n%10;
            n /= 10;
        }

        if(isNeg) newDigit = -newDigit;

        if (newDigit > Integer.MAX_VALUE || newDigit < Integer.MIN_VALUE)
            return 0;

        return (int) newDigit;
    }
}