/**
 * Problem Statement: https://leetcode.com/problems/reverse-integer/
 * Created by kevin
 */
public class ReverseInteger {
    // this problem is also solvable by casting to string and swapping first and last until center
    public int reverse(int x) {
        if (x == 0) return 0;
        long input = x;
        if (input > Integer.MAX_VALUE || input < Integer.MIN_VALUE) {
            return 0;
        }
        boolean wasNeg = false;
        long reversed = 0;
        if (input < 0) {
            input = Long.parseLong(("" + x).substring(1));
            wasNeg = true;
        }
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        if (wasNeg) {
            return Integer.parseInt("-" + (int) reversed);
        }
        return (int) reversed;
    }
}
