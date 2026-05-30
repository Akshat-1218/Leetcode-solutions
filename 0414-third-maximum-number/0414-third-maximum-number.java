class Solution {
    public int thirdMax(int[] arr) {
        boolean foundThird = false;
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]<first && arr[i]>second){
                third = second;
                second = arr[i];
            }
            else if(arr[i] < second && arr[i] > third){
            third = arr[i];
            foundThird = true;
}
        }
        if(third != Long.MIN_VALUE){
            foundThird = true;
        }
        return foundThird ? (int)third : (int)first;
    }
}