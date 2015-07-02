/**
 * Problem Statement: https://leetcode.com/problems/add-two-numbers/
 * Created by kevin
 */

// Definition; not needed for solution
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1ptr = l1;
        ListNode l2ptr = l2;
        ListNode currptr = new ListNode(0);
        ListNode root = currptr;
        int sum;
        int carry = 0;
        while (l1ptr != null && l2ptr != null) {
            sum = l1ptr.val + l2ptr.val + carry;
            if (sum > 9) { // need to carry
                sum -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            currptr.next = new ListNode(sum);
            currptr = currptr.next;
            if (l1ptr.next == null && l2ptr.next != null) {
                l2ptr = l2ptr.next;
                l1ptr.val = 0;
            } else if (l1ptr.next != null && l2ptr.next == null) {
                l1ptr = l1ptr.next;
                l2ptr.val = 0;
            } else {
                l1ptr = l1ptr.next;
                l2ptr = l2ptr.next;
            }
        }
        if (carry == 1) {
            currptr.next = new ListNode(carry);
            // currptr = currptr.next;
        }
        return root.next;
    }
}