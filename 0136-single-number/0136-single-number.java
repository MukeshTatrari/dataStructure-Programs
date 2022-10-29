class Solution {

    public int singleNumber(int[] nums) {
        Map<Integer, Long> occurrences = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        AtomicInteger data = new AtomicInteger();
        occurrences.forEach(
            (k, v) -> {
                if (v == 1) {
                    data.set(k);
                }
            }
        );

        return data.get();
    }
}
