package sf.test;

/**
 * @author yaokoo
 * @create 2022/6/29 14:04
 */
public class Test5 {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode ite(ListNode head){
        ListNode pre=null;
        ListNode next;
        ListNode curr = head;
        while (curr!=null){
            next=curr.next;    //1.截断后面的 2.改变指针朝向 3.移动cur当前指针
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }

    public static ListNode rec(ListNode head){
        if (head==null||head.next==null){
            return head;
        }
        ListNode newnode = rec(head.next);
        head.next.next=head;
        head.next=null;
        return newnode;
    }
    public static void main(String[] args) {
        
    }
}
