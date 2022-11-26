class Solution {

    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int i = 0, j = 0;
        StringBuilder s = new StringBuilder();
        while (i < m && j < n) {
            s.append(String.valueOf(word1.charAt(i)))
                .append(String.valueOf(word2.charAt(j)));
            i++;
            j++;
        }
        while (i < m) {
            s.append(String.valueOf(word1.charAt(i)));
            i++;
        }
        while (j < n) {
            s.append(String.valueOf(word2.charAt(j)));
            j++;
        }
        return s.toString();
    }
}
