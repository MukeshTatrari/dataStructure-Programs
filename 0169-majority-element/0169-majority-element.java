import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int max = 0;
        int maxEntry = 0;
        for (Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > max) {
                maxEntry = e.getKey();
                max = e.getValue();
            }
        }
        return maxEntry;
    }
}
