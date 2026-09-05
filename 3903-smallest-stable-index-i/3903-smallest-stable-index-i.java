class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return -1;
        
        // Step 1: Precompute the minimums from the right (suffix minimums)
        int[] minRight = new int[n];
        minRight[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(nums[i], minRight[i + 1]);
        }
        
        // Step 2: Traverse from left to right and track the maximums
        int maxLeft = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxLeft = Math.max(maxLeft, nums[i]);
            
            // Step 3: Check the instability condition
            if (maxLeft - minRight[i] <= k) {
                return i; // Return immediately for the smallest stable index
            }
        }
        
        return -1;
    }
}
