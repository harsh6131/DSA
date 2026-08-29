class Solution {
    public int trailingZeroes(int n) {
        int trailingZeroes = 0;

        while(n >= 5){
            n /= 5;
            trailingZeroes += n;

        }

        return trailingZeroes;
    }
}