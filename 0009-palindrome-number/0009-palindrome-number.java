class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int reverse = 0;
        int temp = x;
        while(temp > 0){
            int q = temp % 10;
            reverse = reverse * 10 + q;
            temp /= 10;
        }
        if(reverse == x){
            return true;
        }
        return false;
    }
}