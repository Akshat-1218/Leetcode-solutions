class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
    public void backtrack(int index,int k,int n,ArrayList<Integer> current,List<List<Integer>> ans){
        if(k == 0){
            if(n == 0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        if(n <= 0){
            return;
        }
        for(int i=index;i<=9;i++){
            if(i>n){
                break;
            }
            current.add(i);
            backtrack(i+1,k-1,n-i,current,ans);
            current.remove(current.size()-1);
        }
    }
}