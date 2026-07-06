class Solution {
    public boolean isPalindrome(int x) {
        int result = 0;
        int num = x;
        if(x<0){
            return false;
        }
        while(x>0){
            int rem = x%10;
            result = result*10 + rem;
            x /= 10;
        }
        if(result == num){
            return true;
        }
        else{
            return false;
        }
    }
}