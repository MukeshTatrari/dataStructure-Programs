class Solution {
    public int removeDuplicates(int[] nums) {
        
       int [] arr = Arrays.stream(nums).distinct().toArray();
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
		return arr.length;
        
    }
}