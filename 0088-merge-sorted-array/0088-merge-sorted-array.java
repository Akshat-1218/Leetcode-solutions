class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m+n-1;
        int i = m-1;
        int right = n-1;
        while(i >=0 && right >=0){
            if(nums1[i]<=nums2[right]){
                nums1[left] = nums2[right];
                left--;
                right--;
            }
            else{
                nums1[left--] = nums1[i--];
            }
        }
        while(i>=0){
            nums1[left--] = nums1[i--];
        }
        while(right>=0){
            nums1[left--] = nums2[right--];
        }
    }
}