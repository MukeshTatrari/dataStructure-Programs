class Solution {

    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int previousSum = 0;
        for (int i = 0; i < n; i++) {
            int n1 = accounts[i].length;
            int sum = 0;
            for (int j = 0; j < n1; j++) {
                sum = sum + accounts[i][j];
            }
            if (previousSum < sum) {
                previousSum = sum;
            }
        }
        return previousSum;
    }
}
