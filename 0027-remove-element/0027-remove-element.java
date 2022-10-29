class Solution {
    public int removeElement(int[] nums, int val) {
        int [] arr = Arrays.stream(nums).filter(e->e!=val).toArray();
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
		return arr.length;
    }
}