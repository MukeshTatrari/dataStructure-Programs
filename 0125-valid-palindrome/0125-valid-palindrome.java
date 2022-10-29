class Solution {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder st = new StringBuilder(s);
        if (st.reverse().toString().equalsIgnoreCase(s)) {
            return true;
        } else {
            return false;
        }
    }
}
