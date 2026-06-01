class Solution {
    public String reversePrefix(String word, char ch) {
        
        char[] result = word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                int j = 0;
                int k = i;
                while(j<k){
                    char temp = result[j];
                    result[j] = result[k];
                    result[k] = temp;
                    j++;
                    k--;
                }
                break;
            }
        }
        return new String(result);
    }
}