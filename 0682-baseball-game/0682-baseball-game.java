class Solution {
    public int calPoints(String[] op) {
        int result = 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<op.length;i++){
            String number = op[i];
            if(number.equals("+")){
                int val1 = st.pop();
                int val2 = st.pop();
                int valk = val1+val2;
                st.push(val2);
                st.push(val1);
                st.push(valk);
            }
            else if(number.equals("C")){
                st.pop();
            }
            else if(number.equals("D")){
                st.push(2*st.peek());
            }
            else{
                st.push(Integer.parseInt(number));
            }
        }
        while(st.size()>0){
            result+=st.pop();
        }
        return result;
    }
}