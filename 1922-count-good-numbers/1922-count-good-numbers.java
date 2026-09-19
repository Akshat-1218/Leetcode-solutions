class Solution {
    static final long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long ans = power(5,even)*power(4,odd) % MOD;
        return (int)ans;
    }
    public static long power(long a,long n){
        if(n==0){
            return 1;
        }
        long half = power(a,n/2);
        if(n%2==0){
            return half*half % MOD;
        }
        else{
            return half*half % MOD * a % MOD;
        }
    }
}