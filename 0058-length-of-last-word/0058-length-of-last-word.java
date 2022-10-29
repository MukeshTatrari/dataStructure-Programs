class Solution {
    public int lengthOfLastWord(String s) {
        String[] as = s.split(" ");
        String s1 = as[as.length-1];
        return s1.length();
    }
}