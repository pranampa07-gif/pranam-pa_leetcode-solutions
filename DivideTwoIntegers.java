class Solution {
    public int divide(int dividend, int divisor) {

        // Special overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine whether answer should be negative
        boolean negative = (dividend < 0) != (divisor < 0);

        // Convert to long to safely handle -2147483648
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long quotient = 0;

        // Subtract large multiples using bit shifting
        while (a >= b) {

            long temp = b;
            long multiple = 1;

            while (a >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            a = a - temp;
            quotient = quotient + multiple;
        }

        // Apply sign
        if (negative) {
            quotient = -quotient;
        }

        return (int) quotient;
    }
}
