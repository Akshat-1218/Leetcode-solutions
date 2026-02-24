class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        for (long position = 1; position <= n; position *= 10) {
        long left = n / (position * 10);
        long cur = (n / position) % 10;
        long right = n % position;

        if (cur == 0) {
            count += left * position;
        } 
        else if (cur == 1) {
            count += left * position + right + 1;
        } 
        else {
            count += (left + 1) * position;
        }
    }
        return count;
    }
}