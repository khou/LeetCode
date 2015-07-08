/**
 * Problem Statement: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
 * Created by kevin
 */

public class MinInRotSortedArrayII {
    // run time should not be affected...
    // TODO: improve efficiency
    public int findMin(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            int prev = nums[0];
            if(nums[i] < prev){
                return nums[i];
            }
        }
        return nums[0];
    }
}
