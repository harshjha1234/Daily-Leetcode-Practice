class Solution {
    public long isPalindrome(long n, boolean even){
        long res = n; 
        if(!even){
            n = n / 10;
        }
        while(n > 0){
            res = (res * 10 ) + (n % 10);
            n = n / 10;  
        }
        return res;
    }
    public long[] kthPalindrome(int[] queries, int intLength) {
        // Arrays.sort(queries);
        long[] ans = new long[queries.length];
        int half = (intLength + 1)/2;
        boolean even = (intLength % 2 == 0) ? true : false;
        long start = (long)Math.pow(10, half-1);
        long end = (long)Math.pow(10, half) - 1;
        int i=0;
        for( i=0; i<queries.length; i++){
            if(queries[i] <= end-start+1){
                ans[i] = isPalindrome(queries[i] + start - 1, even);
            }else{
                ans[i] = -1;   
            }
        }   
        return ans;
    }
}