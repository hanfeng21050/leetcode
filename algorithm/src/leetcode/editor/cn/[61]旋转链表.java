package leetcode.editor.cn;
import leetcode.editor.node.*;
class question_61{
//给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。 
//
// 示例 1: 
//
// 输入: 1->2->3->4->5->NULL, k = 2
//输出: 4->5->1->2->3->NULL
//解释:
//向右旋转 1 步: 5->1->2->3->4->NULL
//向右旋转 2 步: 4->5->1->2->3->NULL
// 
//
// 示例 2: 
//
// 输入: 0->1->2->NULL, k = 4
//输出: 2->0->1->NULL
//解释:
//向右旋转 1 步: 2->0->1->NULL
//向右旋转 2 步: 1->2->0->NULL
//向右旋转 3 步: 0->1->2->NULL
//向右旋转 4 步: 2->0->1->NULL 
// Related Topics 链表 双指针 
// 👍 335 👎 0


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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0) {
            return head;
        }

        ListNode tmp = head;
        int len = 0;
        while(tmp != null) {
            tmp = tmp.next;
            len ++;
        }

        int step = k % len;
        if(step == 0) {
            return head;
        }

        ListNode firstNode = head;
        ListNode secondNode = head;
        while(step > 0) {
            secondNode = secondNode.next;
            step--;
        }

        while(secondNode.next !=null) {
            secondNode = secondNode.next;
            firstNode = firstNode.next;
        }
        secondNode.next = head;
        ListNode newHead = firstNode.next;
        firstNode.next = null;
        return newHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}