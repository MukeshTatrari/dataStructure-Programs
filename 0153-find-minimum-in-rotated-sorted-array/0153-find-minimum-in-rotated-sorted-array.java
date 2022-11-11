class Solution {

    public int findMin(int[] nums) {
        int min = Arrays.stream(nums).boxed().min(Integer::compareTo).get();
        return min;
    }
}
