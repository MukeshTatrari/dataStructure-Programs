class Solution {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int count = 0;

        char s1Arr[] = s1.toCharArray();
        Arrays.sort(s1Arr);
        char s2Arr[] = s2.toCharArray();
        Arrays.sort(s2Arr);
        String s11 = new String(s1Arr);
        String s21 = new String(s2Arr);
        if (!s11.equals(s21)) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
            if (count > 2) {
                return false;
            }
        }
        return true;
    }
}
