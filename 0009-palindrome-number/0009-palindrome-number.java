class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder st = new StringBuilder(String.valueOf(x));
        String p = st.reverse().toString();
        if(s.equalsIgnoreCase(p)){
            return true;
        }else
        {
            return false;
        }
    }
}