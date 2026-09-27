class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        String[] phone = {
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        backtrack(0,digits,phone,new StringBuilder(),ans);
        return ans;
    }
    public void backtrack(int index,String digits,String[] phone,StringBuilder current,List<String> ans){
        if(index == digits.length()){
            ans.add(current.toString());
            return;
        }
        String letters = phone[digits.charAt(index)-'0'];
        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));

            backtrack(index + 1, digits, phone, current, ans);

            current.deleteCharAt(current.length() - 1);
        }
    }
}