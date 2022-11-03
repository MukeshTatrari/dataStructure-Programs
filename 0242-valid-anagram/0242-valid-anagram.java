import java.util.Arrays;

class Solution {

    public boolean isAnagram(String s, String t) {
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        String s1 = new String(tempArray);
        char tempArray1[] = t.toCharArray();
        Arrays.sort(tempArray1);
        String s2 = new String(tempArray1);

        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }
}
