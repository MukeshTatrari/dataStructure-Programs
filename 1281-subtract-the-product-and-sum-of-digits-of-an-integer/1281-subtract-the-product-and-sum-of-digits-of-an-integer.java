class Solution {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int n2=n;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            product = product * d;
            n = n / 10;
        }
       
        while (n2 > 0) {
            int p1 = n2 % 10;
            sum = sum + p1;
            n2 = n2/ 10;
        }
        return product-sum;
    }
}
