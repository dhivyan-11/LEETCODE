class Solution {
    public int reverse(int x) {
        boolean sign=true;
        if(x<0){
            sign= false;
        }
        int rev=0;
        x=Math.abs(x);
        
        while(x>0){
            int digit=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            rev=rev*10 + digit;
            x/=10;
           
           
        }
        if(!sign){
            return -1*(int)rev;
        }
        return (int)rev;
        
    }
}