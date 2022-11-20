class Solution {

    public int[] twoSum(int[] num, int target) {
        int[] result = new int[2];
        if (num == null || num.length < 2) return result;
        int i = 0, j = num.length - 1;
        while (i < j) {
            int v = num[i] + num[j];
            if (v == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else if (v > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}
