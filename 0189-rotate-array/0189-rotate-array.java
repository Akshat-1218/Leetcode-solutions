class Solution {
    public int[] rotate(int[] nums, int k) {
        if (nums.length == 0) return nums;
        int last = nums.length - 1;
        int i = k % nums.length;
        reverse(nums, 0, last - i);
        reverse(nums, last - i + 1, last);
        reverse(nums, 0, last);
        return nums;
    }
    public static void reverse(int[] nums, int a, int b) {
        while (a < b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}