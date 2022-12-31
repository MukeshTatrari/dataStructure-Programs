import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        
        BigInteger x = new BigInteger(num1);
        BigInteger x1= new BigInteger(num2);
        String x2 = x.multiply(x1).toString();
        
        return x2;
        
    }
}