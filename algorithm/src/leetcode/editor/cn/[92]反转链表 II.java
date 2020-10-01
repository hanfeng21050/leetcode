package leetcode.editor.cn;
import leetcode.editor.node.*;
class question_92{
//反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。 
//
// 说明: 
//1 ≤ m ≤ n ≤ 链表长度。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL, m = 2, n = 4
//输出: 1->4->3->2->5->NULL 
// Related Topics 链表 
// 👍 532 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    ListNode next = null;

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == 1) {
            return reverse(head, n);
        }
        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }


    public  ListNode reverse(ListNode head, int n) {
        if(n == 1) {
            next = head.next;
            return head;
        }

        ListNode last = reverse(head.next, n-1);
        head.next.next = head;
        head.next = next;

        return last;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}