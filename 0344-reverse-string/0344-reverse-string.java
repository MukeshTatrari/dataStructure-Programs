class Solution {

    public void reverseString(char[] s) {
        String p = new String(s);
        int j = 0;
        for (int i = p.length() - 1; i >= 0; i--) {
            s[j] = p.charAt(i);
            j++;
        }
    }
}
