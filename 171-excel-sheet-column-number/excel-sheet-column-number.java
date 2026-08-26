class Solution {
    public int titleToNumber(String col) {
        
        int sum=0, p=0;
        int n = col.length();

        for(int i=n-1; i>=0; i--){

            int tmp = col.charAt(i)-64;
            sum = sum+(int)Math.pow(26,p++)*tmp;

        }
        return sum;
    }
}