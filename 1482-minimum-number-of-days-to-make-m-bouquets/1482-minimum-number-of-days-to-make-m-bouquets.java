class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i] > max){
                max = bloomDay[i];
            }
            if(bloomDay[i]<min){
                min = bloomDay[i];
            }
        }
        int low = min;int high = max;int ans = high;
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid +1 ;
            }
        }
        return ans;
    }
    public static boolean possible(int[] bloomDay,int days,int m,int k){
        int count = 0;
        int blooms = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=days){
                count++;
            }
            else{
                blooms += (count/k);
                count = 0;
            }
        }
        blooms += (count/k);
        if(blooms >= m){
            return true;
        }
        else{
            return false;
        }
    }
}