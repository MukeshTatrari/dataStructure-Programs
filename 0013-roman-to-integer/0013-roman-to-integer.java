class Solution {

    public int romanToInt(String s) {
        int sum = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int x = value(chars[i]);
            if (i + 1 < s.length()) {
                int y = value(s.charAt(i + 1));
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

    public int value(Character r) {
        if (r == 'I') return 1;
        if (r == 'V') return 5;
        if (r == 'X') return 10;
        if (r == 'L') return 50;
        if (r == 'C') return 100;
        if (r == 'D') return 500;
        if (r == 'M') return 1000;
        return 0;
    }
}
