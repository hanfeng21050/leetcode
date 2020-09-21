package leetcode.editor.cn;
import leetcode.editor.node.*;
class question_19{
//给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。 
//
// 示例： 
//
// 给定一个链表: 1->2->3->4->5, 和 n = 2.
//
//当删除了倒数第二个节点后，链表变为 1->2->3->5.
// 
//
// 说明： 
//
// 给定的 n 保证是有效的。 
//
// 进阶： 
//
// 你能尝试使用一趟扫描实现吗？ 
// Related Topics 链表 双指针 
// 👍 993 👎 0


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        ListNode sub = head;
        ListNode tmp = new ListNode(-1);
        tmp.next = head;
        while (n > 1) {
            sub = sub.next;
            n--;
        }
        if(sub.next == null) {
            return head.next;
        }
        while (sub.next != null) {
            sub = sub.next;
            pre = pre.next;
            tmp = tmp.next;
        }
        if(sub.next == null && pre.next == null) {
            tmp.next = null;
        }else {
            tmp.next = pre.next;
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}