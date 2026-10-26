import java.util.Stack;

class StockSpanner {

    Stack<Integer> s;
    ArrayList<Integer> stocks;
    int index;
    public StockSpanner() {
        s = new Stack<>();
        stocks = new ArrayList<>();
        index = 0;
    }

    public int next(int price) {

        stocks.add(price);
        while(!s.isEmpty() && price >= stocks.get(s.peek())){
            s.pop();
        }
        int span;
        if(s.isEmpty()){
            span = index+1;
        }
        else{
            int prevHigh = s.peek();
            span = index - prevHigh;
        }
        s.push(index);
        index++;
        return span;
    }
}