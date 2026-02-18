class Solution {
    public String reverseWords(String s) {
        String words[] = s.trim().split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            if(words[i].length()>0){
                str.append(words[i]);
                str.append(" ");
            }
        }
        return str.substring(0,str.length()-1).toString();
    }
}