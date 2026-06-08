class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left<right){
            if(!isVowel(ch[left])){
                left++;
            }
            else if(!isVowel(ch[right]) ){
                right--;
            }
            else{
                char tmp = ch[left];
                ch[left] = ch[right];
                ch[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}