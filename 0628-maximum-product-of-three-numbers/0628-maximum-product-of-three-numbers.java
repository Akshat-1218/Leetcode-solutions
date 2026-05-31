class Solution {
    public int maximumProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int bottom1 = Integer.MAX_VALUE;
        int bottom2 = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i]<=first && nums[i]>second){
                third = second;
                second = nums[i];
            }
            else if(nums[i]<=second && nums[i]>third){
                third = nums[i];
            }
            if(nums[i]<=bottom1){
                bottom2 = bottom1;
                bottom1 = nums[i];
            }
            else if(nums[i]>=bottom1 && nums[i]<bottom2){
                bottom2 = nums[i];
            }
        }
        return Math.max(bottom1*bottom2*first,first*second*third);
    }
}