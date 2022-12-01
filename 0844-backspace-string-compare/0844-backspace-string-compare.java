class Solution {

    public boolean backspaceCompare(String s, String t) {
        return formatString(s).equals(formatString(t));
    }

    private String formatString(String s) {
        StringBuilder builder = new StringBuilder(s);
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            index++;
            char c = s.charAt(i);
            if (c == '#') {
                index--;
                builder.deleteCharAt(index);
                if (index > 0) {
                    index--;
                    builder.deleteCharAt(index);
                }
            }
        }
        return builder.toString();
    }
}
