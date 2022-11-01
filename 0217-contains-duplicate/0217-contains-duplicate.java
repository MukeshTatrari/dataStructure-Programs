class Solution {

    public boolean containsDuplicate(int[] nums) {
        int[] abc = Arrays.stream(nums).distinct().toArray();
        return abc.length != nums.length;
    }
}
