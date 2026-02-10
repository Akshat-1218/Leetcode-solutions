class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
    //     int start = nums[0];
    //     int end = nums[n-1];
    //     int mid = (start+end)/2;
    //     for(int i=0;i<n;i++){
    //         while(start<end){
    //         if(nums[mid]==target){
    //             return mid;
    //         }
    //         else if(nums[mid]>target){
    //             mid = end-1;
    //         }
    //         else{
    //             mid = start+1;
    //         }
    //     }
    // }
    //     return -1;

    for(int i=0;i<n;i++){
        if(nums[i]==target){
            return i;
        }
    }
    return -1;
    }
}