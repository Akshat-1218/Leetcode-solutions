class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        uniqueCombination(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public static void uniqueCombination(int index,int[] candidates,int target,List<Integer> current,List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index == candidates.length || target < 0){
            return;
        }
        if(candidates[index] <= target){
            current.add(candidates[index]);
        
        uniqueCombination(index,candidates,target-candidates[index],current,ans);
        current.remove(current.size()-1);
        }
        uniqueCombination(index+1,candidates,target,current,ans);
    }

}