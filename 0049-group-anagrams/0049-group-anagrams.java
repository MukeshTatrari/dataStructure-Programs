class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> st = new ArrayList<>();
        Map<String, List<String>> hs = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String p = strs[i];
            char[] arr = p.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (hs.containsKey(sorted)) {
                List<String> m = hs.get(sorted);
                List<String> m1 = new ArrayList<>();
                m1.add(p);
                m1.addAll(m);
                hs.put(sorted, m1);
            } else {
                hs.put(sorted, Arrays.asList(p));
            }
        }
        for (Map.Entry<String, List<String>> entry : hs.entrySet()) {
            st.add(entry.getValue());
        }
        return st;
    }
}