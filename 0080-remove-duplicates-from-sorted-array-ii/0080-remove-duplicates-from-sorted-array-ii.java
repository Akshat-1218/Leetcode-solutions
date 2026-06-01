class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for(int i = 2;i<nums.length;i++){
            if(nums[i] != nums[k-2]){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        return k;
        
    }
}