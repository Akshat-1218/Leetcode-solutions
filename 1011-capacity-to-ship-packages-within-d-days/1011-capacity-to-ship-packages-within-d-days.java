class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max = Math.max(weights[i],max);
        }
        int sum = 0;
        for(int i=0;i<weights.length;i++){
            sum += weights[i];
        }
        int left = max;
        int right = sum;
        int ans = sum;

        while(left<=right){
            int mid = (left+right)/2;
            int number_days = function(weights,mid);
            if(number_days>days){
                left = mid+1;
            }
            else{
                ans = mid;
                right = mid-1;
                
            }
        }
        return ans;
    }
    public static int function(int[] weights,int cap){
        int load = 0;
        int day = 1;
        for(int i=0;i<weights.length;i++){
            if(load + weights[i] > cap){
                day++;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return day;
    }
}