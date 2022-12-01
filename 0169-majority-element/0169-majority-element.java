import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {

    public int majorityElement(int[] nums) {
        var occurrences = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        final int[] data = new int[1];
        final int[] key = new int[1];
        occurrences.forEach(
            (k, v) -> {
                if (v > data[0]) {
                    key[0] = k;
                    data[0] = Math.toIntExact(v);
                }
            }
        );
        return key[0];
    }
}
