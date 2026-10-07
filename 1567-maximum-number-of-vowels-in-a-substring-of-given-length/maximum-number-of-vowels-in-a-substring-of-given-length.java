class Solution {
    public int maxVowels(String s, int k) {
        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                count++;

            if (i >= k && isVowel(s.charAt(i - k)))
                count--;

            if (i >= k - 1)
                max = Math.max(max, count);
        }

        return max;
    }

    boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}