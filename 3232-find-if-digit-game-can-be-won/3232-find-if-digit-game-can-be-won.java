class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum = 0;
        int twoSum = 0;
     for(int i=0;i<nums.length;i++){
        int result = nums[i];
        if(result>=0 && result<=9){
            sum+=result;
        }
        else{
            twoSum+=result;
        }
     }
     if(sum>twoSum || twoSum>sum){
        return true;
     }   
     else{
        return false;
     }
    }
}