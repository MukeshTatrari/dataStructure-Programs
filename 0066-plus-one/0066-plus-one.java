import java.math.*;
class Solution {

    public int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            s.append(digits[i]);
        }
        BigInteger x = new BigInteger(s.toString());
        x = x.add(BigInteger.valueOf(1));
        String p = x.toString();
        int arr[] = new int[p.length()];
        for (int j = 0; j < p.length(); j++) {
            int a = Character.getNumericValue(p.charAt(j));
            arr[j] = a;
        }
        return arr;
    }
}
