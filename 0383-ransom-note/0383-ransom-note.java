class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int al[] = new int[26];

        for(char ch:magazine.toCharArray()){
            al[ch-'a']++;
        }

        for(char ch:ransomNote.toCharArray()){
            al[ch-'a']--;
            if(al[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}