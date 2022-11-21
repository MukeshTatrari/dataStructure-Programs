class Solution {

    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String p = new String();
        for (int i = 0; i < str.length; i++) {
            StringBuilder st = new StringBuilder(str[i]);
            if (i == 0) {
                p += st.reverse();
            } else {
                p += " " + st.reverse();
            }
        }
        return p;
    }
}
