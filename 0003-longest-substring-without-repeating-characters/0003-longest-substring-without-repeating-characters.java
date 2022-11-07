class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0 || s == "") {
            return 0;
        }
        String p = String.valueOf(s.charAt(0)), x = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            x = String.valueOf(s.charAt(i));
            if(!p.contains(x)){
                p = p+x;
            }else{
                p = p.substring(p.lastIndexOf(x)+1) +x;
            }
            if(maxLength<p.length()){
                maxLength = p.length();
            }
        }

        return maxLength;
    }
}
