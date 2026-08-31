class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = (nums.length/3)+1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i) == n){
                l.add(i);
            }
        }
        return l;
    }
}