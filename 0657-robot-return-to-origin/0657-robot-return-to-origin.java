class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(char ch : moves.toCharArray()){
            if(ch=='U'){
                y++;
            }
            else if(ch=='D'){
                y--;
            }
            else if(ch=='L'){
                x--;
            }
            else if(ch=='R'){
                x++;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        else{
            return false;
        }
    }
}