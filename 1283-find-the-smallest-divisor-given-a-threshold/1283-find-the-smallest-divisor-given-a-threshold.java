class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        int left = 1;
        int right = max;
        int ans = max;
        while(left<=right){
            int mid = (left+right)/2;
            int sum = 0;
            for(int j=0;j<nums.length;j++){
                sum += Math.ceil((double) nums[j]/mid);
            }
            if(sum>threshold){
                left = mid+1;
            }
            else{
                ans = mid;
                right = mid-1;
            }
        }
        return ans;
    }
}