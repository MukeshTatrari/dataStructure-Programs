class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int s1 = 0, t1 = 0;
        while (t1 < t.length()) {
            if (t.charAt(t1) == s.charAt(s1)) {
                s1++;
                if (s1 == s.length()) return true;
            }
            t1++;
        }
        return false;
    }
}
