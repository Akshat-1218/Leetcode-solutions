class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        if(n==1){
            return x;
        }
        long binForm = n;
        double ans = 1;
        if(binForm<0){
            x = 1/x;
            binForm = -binForm;
        }
        while(binForm>0){
            if(binForm%2==1){
                ans = ans*x;
            }
            x *=x;
            binForm /= 2;
        }
        return ans;
    }
}