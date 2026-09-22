class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int a = nums.length;
        int n = (1<<a);
        for(int i=0;i<n;i++){
            List<Integer> ans = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j)) != 0){
                    ans.add(nums[j]);
                }
            }
            list.add(ans);
        }
        return list;
    }
}