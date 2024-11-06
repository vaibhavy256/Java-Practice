package com.examples.practice;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        // If only one row or the string is shorter than numRows, return the original string
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create a list of StringBuilder for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        // Variables to control the row index and direction (down or up)
        int currentRow = 0;
        boolean goingDown = false;

        // Traverse through the string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // Reverse direction if at the top or bottom row
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Update currentRow: move down or up
            currentRow += goingDown ? 1 : -1;
            System.out.print(currentRow);
        }

        // Combine all rows into one string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));  // Output: "PAHNAPLSIIGYIR"
    }
}
