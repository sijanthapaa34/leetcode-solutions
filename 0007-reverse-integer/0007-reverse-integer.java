class Solution {
    public int reverse(int x) {
        boolean isNeg = x<0;
        long n = Math.abs(x);
        
        /* Method 1
        String str = String.valueOf(Math.abs(x));
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<chars.length; i++){
            sb.append(chars[chars.length-i-1]);

        }
        long result = Long.parseLong(sb.toString());

        if(isNeg)
            result = -result;
        if(Integer.MIN_VALUE>result || result>Integer.MAX_VALUE)
            return 0;
        
        return (int) result; 
        */

        /* Method 2
        long newDigit = 0;
        while(n>0){
            newDigit *= 10;
            newDigit += n%10;
            // newDigit = newDigit*10 + n%10;

            n /= 10;
        }

        if(isNeg) newDigit = -newDigit;
        
        if (newDigit > Integer.MAX_VALUE || newDigit < Integer.MIN_VALUE)
            return 0;

        return (int) newDigit;
         */

        long newDigit = doReverse(0, n);

        if(isNeg) newDigit = -newDigit;
        
        if (newDigit > Integer.MAX_VALUE || newDigit < Integer.MIN_VALUE)
            return 0;

        return (int) newDigit;

    }
    public long doReverse(long newDigit, long n) {
        if(n == 0){
            return newDigit;
        }
        return doReverse(newDigit*10 + n%10, n/10);
    }
}