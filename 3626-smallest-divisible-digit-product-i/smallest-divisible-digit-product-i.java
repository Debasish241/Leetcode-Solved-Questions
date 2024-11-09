class Solution {
    public int smallestNumber(int n, int t) {
        int number = n;
    while (true) {
        int product = 1;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }
        if (product % t == 0) {
            return number;
        }
        number++;
    }
    }
}