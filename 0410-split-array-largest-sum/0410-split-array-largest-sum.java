class Solution {
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(nums[i],max);
            sum += nums[i];
        }
        int left = max;
        int right = sum;
        while(left<=right){
            int mid = (left+right)/2;
            int split = func(nums,mid);
            if(split>k) left = mid+1;
            else right = mid-1;
        }
        return left;
    }
    public static int func(int[] arr,int mid){
        int split = 1;
        int value = 0;
        for(int i=0;i<arr.length;i++){
            if(value + arr[i] <=mid){
                value += arr[i];
            }
            else{
                split++;
                value = arr[i];
            }
        }
        return split;
    }
}