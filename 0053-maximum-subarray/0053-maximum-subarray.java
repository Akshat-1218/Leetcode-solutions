class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i=0;i<nums.length;i++){
            currsum = Math.max(nums[i],currsum+nums[i]);                
            maxSum = Math.max(currsum,maxSum);
        }
        return maxSum;
    }
}