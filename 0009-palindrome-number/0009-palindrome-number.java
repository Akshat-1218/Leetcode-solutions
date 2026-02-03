class Solution {
    public boolean isPalindrome(int x) {
        int result = x;
        int sum=0;
        while(x>0){
            int ans = x%10;
            sum=sum*10+ans;
            x=x/10;
        }
        if(result==sum){
            return true;
        }
        else{
            return false;
        }
    }
}