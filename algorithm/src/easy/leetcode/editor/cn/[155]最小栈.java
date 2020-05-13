package easy.leetcode.editor.cn;

class question_155{
//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。 
//
// 
// push(x) —— 将元素 x 推入栈中。 
// pop() —— 删除栈顶的元素。 
// top() —— 获取栈顶元素。 
// getMin() —— 检索栈中的最小元素。 
// 
//
// 
//
// 示例: 
//
// 输入：
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//输出：
//[null,null,null,null,-3,null,0,-2]
//
//解释：
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin();   --> 返回 -3.
//minStack.pop();
//minStack.top();      --> 返回 0.
//minStack.getMin();   --> 返回 -2.
// 
//
// 
//
// 提示： 
//
// 
// pop、top 和 getMin 操作总是在 非空栈 上调用。 
// 
// Related Topics 栈 设计


//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {

    class Node{
        int x;
        Node nextNode;
        public Node() {
        }
        public Node(int x) {
            this.x = x;
        }
    }

    Node head;
    Node end;
    Node minStack;
    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Node(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        if(head == null)
        {
            head = new Node(x);
            end = head;
        }else{
            Node node = new Node(x);
            node.nextNode =  head;
            head = node;
        }

        int minValue = Math.min(minStack.x,x);
        Node node = new Node(minValue);
        node.nextNode = minStack;
        minStack = node;

    }
    
    public void pop() {
        if (end == null)
        {
            return;
        }
        head = head.nextNode;
        minStack = minStack.nextNode;
    }
    
    public int top() {
        return head.x;
    }
    
    public int getMin() {
        return minStack.x;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}