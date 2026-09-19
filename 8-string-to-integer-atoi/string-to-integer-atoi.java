
class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int i = 0, n = s.length();
        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        if (i == n) return 0;
        
        // 2. Check sign
        int sign = 1;
        char firstChar = s.charAt(i);
        if (firstChar == '-' || firstChar == '+') {
            sign = (firstChar == '-') ? -1 : 1;
            i++;
        }
        
        long result = 0; // Use long to detect overflow before clamping
        
        // 3. Convert digits and handle overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            
            // 4. Check for 32-bit signed integer overflow/underflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        
        return (int) (result * sign);
    }
}
