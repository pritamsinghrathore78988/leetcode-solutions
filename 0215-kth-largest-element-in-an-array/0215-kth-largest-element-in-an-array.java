class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int p=0;
    return nums[nums.length-k];
        
    }
}