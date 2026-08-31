class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int elem1 = 0;
        int elem2 = 0;
        int count1 = 0 ;
        int count2 = 0;
        int n = nums.length/3;
        for(int i:nums){
            if(count1 == 0 && elem2 != i){
                elem1 = i;
                count1++;
            }
            else if(count2 == 0 && elem1 != i){
                elem2 = i;
                count2++;
            }
            else if(elem1 == i){
                count1++;
            }
            else if(elem2 == i){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i : nums) {
            if (i == elem1) {
                count1++;
            }
            else if (i == elem2) {
                count2++;
            }
        }
        if(count1 > n) l.add(elem1);
        if(count2 > n) l.add(elem2);
        return l;
    }
}