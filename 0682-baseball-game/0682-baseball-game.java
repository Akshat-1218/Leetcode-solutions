class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<op.length;i++){
            String ch = op[i];
            if(ch.equals("C")){
                s.pop();
            }
            else if(ch.equals("D")){
                int d = s.peek();
                d = d*2;
                s.push(d);
            }
            else if(ch.equals("+")){
                int a = s.pop();
                int b = s.peek();
                int c = a+b;
                s.push(a);
                s.push(c);
            }
            else{
                s.push(Integer.parseInt(ch));
            }
        }
        int sum = 0;
        while(!s.isEmpty()){
            sum += s.pop();
        }
        return sum;
    }
}