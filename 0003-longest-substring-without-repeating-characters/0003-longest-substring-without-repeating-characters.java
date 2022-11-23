class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s == "" || s.length() == 0) {
            return 0;
        }
        String maxString = String.valueOf(s.charAt(0));
        String x = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            x = String.valueOf(s.charAt(i));
            if (!maxString.contains(x)) {
                maxString += x;
            } else {
                maxString = maxString.substring(maxString.lastIndexOf(x) + 1) + x;
            }
            if (maxLength < maxString.length()) {
                maxLength = maxString.length();
            }
        }
        return maxLength;
    }
}
