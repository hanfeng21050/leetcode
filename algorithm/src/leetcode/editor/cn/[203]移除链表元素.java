package leetcode.editor.cn;
import leetcode.editor.node.*;
class question_203{
//删除链表中等于给定值 val 的所有节点。 
//
// 示例: 
//
// 输入: 1->2->6->3->4->5->6, val = 6
//输出: 1->2->3->4->5
// 
// Related Topics 链表 
// 👍 443 👎 0


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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if(head == null) {
            return null;
        }
        ListNode preNode = head;
        ListNode node = head.next;

        while (node != null) {
            if (node.val == val) {
                preNode.next = node.next;
                node = node.next;
            }else {
                preNode = node;
                node = node.next;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}