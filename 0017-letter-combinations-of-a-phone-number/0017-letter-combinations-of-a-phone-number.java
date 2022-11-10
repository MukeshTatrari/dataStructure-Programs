class Solution {

    public List<String> letterCombinations(String digits) {
        List<String> ls = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ls;
        }
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(2, List.of("a", "b", "c"));
        map.put(3, List.of("d", "e", "f"));
        map.put(4, List.of("g", "h", "i"));
        map.put(5, List.of("j", "k", "l"));
        map.put(6, List.of("m", "n", "o"));
        map.put(7, List.of("p", "q", "r", "s"));
        map.put(8, List.of("t", "u", "v"));
        map.put(9, List.of("w", "x", "y", "z"));

        if (digits.length() == 1) {
            if (Integer.parseInt(digits) < 10 && Integer.parseInt(digits) > 1) {
                return map.get(Integer.parseInt(digits));
            }
        }

        for (int i = 0; i < digits.length(); i++) {
            int b = Integer.parseInt(String.valueOf(digits.charAt(i)));
            if (b < 10 && b > 1) {
                if (ls.isEmpty()) {
                    ls.addAll(map.get(b));
                } else {
                    List<String> m = map.get(b);
                    List<String> pn = getList(ls, m);
                    ls = new ArrayList<>(pn);
                }
            }
        }

        return ls;
    }

    List<String> getList(List<String> a, List<String> b) {
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            String p = a.get(i);
            for (int j = 0; j < b.size(); j++) {
                String p1 = b.get(j);
                ls.add(p + p1);
            }
        }
        return ls;
    }
}
