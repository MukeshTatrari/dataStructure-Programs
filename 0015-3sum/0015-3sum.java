class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Set<List<Integer>> cashofsets = new HashSet<>();
        Arrays.sort(nums);
        int size = nums.length;
        set.add(nums[0]);

        for (int i = 1; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int target = 0 - nums[i] - nums[j];
                if (set.contains(target)) {
                    List<Integer> adds = Arrays.asList(target, nums[i], nums[j]);
                    cashofsets.add(adds);
                }
            }
            set.add(nums[i]);
        }
        List<List<Integer>> list = new ArrayList<>();

        for (List<Integer> l : cashofsets) {
            list.add(l);
        }
        return list;
    }
}
