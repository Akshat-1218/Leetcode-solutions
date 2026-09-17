class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch: s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        ArrayList<Character> list = new ArrayList<>(hm.keySet());
        list.sort((a,b) -> hm.get(b) - hm.get(a));
        StringBuilder sb = new StringBuilder();
        for(char ch : list){
            for (int i = 0; i < hm.get(ch); i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}