class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String p = strs[0];
        String n = strs[strs.length-1];
        StringBuilder st = new StringBuilder();
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)==n.charAt(i)){
                st.append(String.valueOf(p.charAt(i)));
            }else{
                break;
            }
        }
        return st.toString();
    }
}