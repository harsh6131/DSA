class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;

        for (char ch : s.toCharArray()) {

            rows[row].append(ch);

            if (row == 0) {
                down = true;
            }

            if (row == numRows - 1) {
                down = false;
            }

            if (down) {
                row++;
            } else {
                row--;
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            answer.append(rows[i]);
        }

        return answer.toString();
    }
}