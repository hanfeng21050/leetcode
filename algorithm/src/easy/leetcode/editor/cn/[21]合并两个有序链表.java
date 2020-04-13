package easy.leetcode.editor.cn;
import easy.leetcode.editor.node.*;
class question_21{
//将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表


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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    /*
    1. 递归
    规律:
    list1[0]+merge(list1[1:],list2)   list1[0]<list2[0]
    list2[0]+merge(list1,list2[1:])   otherwise
    代码:
    if(l1 == null)
        {
            return l2;
        }
        else if(l2 == null)
        {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else
        {
            l2.next = mergeTwoLists(l2.next,l1);
            return l2;
        }
​
    2.迭代




     */
}