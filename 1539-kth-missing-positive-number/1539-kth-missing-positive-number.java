class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 1;
        int i = 0;
        int ans = 0;
        while(i<arr.length){
            if(count != arr[i]){
                ans++;
                if(ans == k){
                    return count;
                }
                count++;
                
                
            }
            else{
                i++;
                count++;
            }
        }
        while(ans < k){
            ans++;
            count++;
        }
        return count-1 ;
    }
}