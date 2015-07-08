import java.util.Hashtable;

/**
 * Problem Statement: https://leetcode.com/problems/roman-to-integer/
 * Created by kevin
 */
public class RomanToInt {
    public int romanToInt(String s) {
        Hashtable<Character, Integer> romans = new Hashtable<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        int integer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) { // next letter is equal
                integer += romans.get(s.charAt(i)) + romans.get(s.charAt(i + 1));
                i++;
            } else { // not equal
                if (i == s.length() - 1) {
                    integer += romans.get(s.charAt(i));
                } else if (romans.get(s.charAt(i + 1)) > romans.get(s.charAt(i))) {
                    integer += (romans.get(s.charAt(i + 1)) - romans.get(s.charAt(i)));
                    i++;
                } else {
                    integer += romans.get(s.charAt(i));
                }
            }
        }
        return integer;
    }
}
