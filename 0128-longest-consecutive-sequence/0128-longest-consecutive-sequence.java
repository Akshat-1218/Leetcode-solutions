class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int maxCount = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]-1){
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                
                count = 1;
            }
        }
        if(nums.length == 0) return 0;
        return maxCount;
    }
}