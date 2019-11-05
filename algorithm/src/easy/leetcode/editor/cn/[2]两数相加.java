package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;
class question_2{
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学



//easy.leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode node = null;
        ListNode next = null;
        boolean carry = false;
        int sum = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                l1 = new ListNode(0);
            }
            if (l2 == null) {
                l2 = new ListNode(0);
            }
            sum = l1.val + l2.val;

            //进位
            if(carry)
            {
                sum ++;
            }

            //判断是否进位
            if(sum >= 10)
            {
                carry = true;
            }else {
                carry = false;
            }
            if (head == null) {
                head = new ListNode(sum >= 10 ? sum - 10 : sum);
                node = head;
            } else {
                next = new ListNode(sum >= 10 ? sum - 10 : sum);
                node.next = next;
                node = node.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        //exp:9+1 = 10
        if(l1 == null && l2 == null && carry == true)
        {
            next = new ListNode(1);
            node.next = next;
            node = node.next;
        }
        return head;
    }
}
//easy.leetcode submit region end(Prohibit modification and deletion)

}