class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[] = new int[2];
        long xor = 0;
        for(int i=0;i<nums.length;i++){
            xor ^= nums[i];
        }
        int b1 = 0;
        int b2 = 0;
        long right = (xor & (xor-1)) ^ xor;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & right ) != 0){
                b1 ^= nums[i];
            }
            else{
                b2 ^= nums[i];
            }
        }
        arr[0] = b1;
        arr[1] = b2;
        return arr;
    }
}