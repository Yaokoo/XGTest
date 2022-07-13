package sf;

import java.util.List;

/**
 * @author yaokoo
 * @create 2022/6/29 11:18
 */

//链表反转
public class Test05 {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //迭代法 从原链表的第一个节点翻转 （双指针）
    public static ListNode iterate(ListNode head){
        ListNode prev = null,next;   //定义前后指针 其中前指针要为空
        ListNode curr=head;  //当前存储指针
        while (curr!=null){
            next=curr.next; // 暂存后继节点
            curr.next=prev;//修改（反转）指针
            prev=curr;//把前指针往后移
            curr=next;//访问下一个节点
        }
        return prev;
    }
    //递归法  （从原链表的最后一个节点翻转 递归到最后一个节点）
    public static ListNode recur(ListNode head){
        if (head==null||head.next==null){
            return head; //当递归到第五个指针的时候就返回了 返回第五个指针
        }
        //(在递归函数里一直传当前节点的下一个节点)
        ListNode new_node=recur(head.next);//递归（先算方法和方法之前的 找到5 然后执行下面的程序 再执行4下面的..） 从最后一个节点倒过来找 避免
        head.next.next=head; //递归算法
        head.next=null;
        return new_node;
    }
    public static void main(String[] args) {
        ListNode node5=new ListNode(5,null);
        ListNode node4=new ListNode(4,node5);
        ListNode node3=new ListNode(3,node4);
        ListNode node2=new ListNode(2,node3);
        ListNode node1=new ListNode(1,node2);
        ListNode pre=recur(node1);
        System.out.println(pre);
    }
}
