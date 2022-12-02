class Solution {

    public void sortColors(int[] nums) {
        int i = 0, countZero = 0, countOne = 0, countTwo = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                countZero++;
            } else if (nums[j] == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }
        while (i < countZero) {
            nums[i] = 0;
            i++;
        }
        while (i < countZero + countOne) {
            nums[i] = 1;
            i++;
        }
        while (i < nums.length) {
            nums[i] = 2;
            i++;
        }
    }
}
