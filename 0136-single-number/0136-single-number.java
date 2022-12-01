class Solution {

    public int singleNumber(int[] nums) {
        var occurrences = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        final int[] data = new int[1];
        occurrences.forEach(
            (k, v) -> {
                if (v == 1) {
                    data[0] = k;
                }
            }
        );
        return data[0];
    }
}
