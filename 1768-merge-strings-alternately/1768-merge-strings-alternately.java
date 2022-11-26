class Solution {

    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int i = 0, j = 0;
        StringBuilder s = new StringBuilder();

        while (i < m || j < n) {
            if (i < m) {
                s.append(word1.charAt(i));
                i++;
            }
            if (j < n) {
                s.append(word2.charAt(j));
                j++;
            }
        }

        return s.toString();
    }
}
