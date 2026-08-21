class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum = Integer.MIN_VALUE;
       int sum = 0;
       for(int i=0;i<nums.length;i++){
        sum = Math.max(nums[i],nums[i]+sum);
        maxSum = Math.max(maxSum,sum);
       }
       return maxSum;
       
    }
}