class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String str = tokens[i];
            if(str.equals("+")){
                int a = s.pop();
                int b = s.pop();
                int c = a+b;
                s.push(c);
            }
            else if(str.equals("-")){
                int a = s.pop();
                int b = s.pop();
                int c = b-a;
                s.push(c);
            }
            else if(str.equals("*")){
                int a = s.pop();
                int b = s.pop();
                int c = b*a;
                s.push(c);
            }
            else if(str.equals("/")){
                int a = s.pop();
                int b = s.pop();
                int c = b/a;
                s.push(c);
            }
            else{
                s.push(Integer.parseInt(str));
            }
        }
        return s.peek();
    }
}