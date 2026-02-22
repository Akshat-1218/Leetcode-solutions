class Solution {
    public int[] rotate(int[] nums, int k) {
        int n = nums.length-1;
        k %=nums.length;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
        return nums;
    }
    public static void reverse(int nums[] ,int start, int end){
        while(start<end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;end--;
    }}
}