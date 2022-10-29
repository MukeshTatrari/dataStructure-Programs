import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger n2 = new BigInteger(a,2);
        BigInteger n3 = new BigInteger(b,2);
        BigInteger sum = n2.add(n3);
        return sum.toString(2);
    }
}