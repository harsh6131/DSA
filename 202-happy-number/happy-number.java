import java.util.*;

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> s = new HashSet<>();

        while (n != 1) {

            if (s.contains(n)) {
                return false;
            }

            s.add(n);

            int sum = 0;

            while (n > 0) {
                int r = n % 10;
                sum += r * r;
                n /= 10;
            }

            n = sum;
        }

        return true;
    }
}