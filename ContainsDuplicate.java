/**
 * Problem Statement: https://leetcode.com/problems/contains-duplicate/
 * Created by kevin
 */

import java.util.Hashtable;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Boolean> occurances = new Hashtable<>();
        int number;
        if (nums.length <= 1) return false;
        for (int i = 0; i < nums.length; i++) {
            number = nums[i];
            if (occurances.get(number) != null && occurances.get(number) == true) {
                return true;
            }
            occurances.put(number, true);
        }
        return false;
    }
}