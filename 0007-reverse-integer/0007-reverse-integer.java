class Solution {

    public int reverse(int x) {
        int rev = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = x * -1;
        }

        int prev_rev_num = 0;
        int reverse = 0;
        while (x > 0) {
            int p = x % 10;
            reverse = reverse * 10 + p;

            if ((reverse - p) / 10 != prev_rev_num) {
                System.out.println("WARNING OVERFLOWED!!!");
                return 0;
            }
            prev_rev_num = reverse;
            x = x / 10;
        }
        if (isNegative) {
            reverse = reverse * (-1);
        }
        return reverse;
    }
}
