class Solution {

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int sum = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int x = map.get(String.valueOf(chars[i]));
            if (i + 1 < s.length()) {
                String n = String.valueOf(s.charAt(i + 1));
                int y = map.get(n);
                if (x < y) {
                    sum = sum + (y - x);
                    i++;
                } else {
                    sum = sum + x;
                }
            } else {
                sum = sum + x;
            }
        }

        return sum;
    }
}
