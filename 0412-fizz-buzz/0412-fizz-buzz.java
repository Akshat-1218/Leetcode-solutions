class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> sb = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                sb.add("FizzBuzz");
            }
            else if(i%3==0){
                sb.add("Fizz");
            }
            else if(i%5==0){
                sb.add("Buzz");
            }
            
            else{
                sb.add(String.valueOf(i));
            }
        }
        return sb;
    }
}