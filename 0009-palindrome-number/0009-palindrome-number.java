class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse=0;
        int original=x;
        while(x>0){
            int p = x % 10;
			reverse = reverse * 10 + p;
			x = x / 10;
        }
        if(original==reverse){
            return true;
        }else{
            return false;
        }
    }
}