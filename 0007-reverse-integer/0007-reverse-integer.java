class Solution {
    public int reverse(int num) {
        long x = num;
        long d=0;
        while(x!=0){
            long r=x%10;
            d=d*10+r;
            if(d>Integer.MAX_VALUE || d<Integer.MIN_VALUE){
            return 0;
        }
            x=x/10;
            
        }
        
        return (int) d;
    }
}