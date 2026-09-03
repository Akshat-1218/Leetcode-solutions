class Solution {
    public int maxProduct(int[] nums) {
        int total = nums[0];
        for(int i=0;i<nums.length;i++){
            int prod = 1;
            for(int j=i;j<nums.length;j++){
                prod *= nums[j];
                total = Math.max(prod,total);
            }
        }
        return total;
    }
}