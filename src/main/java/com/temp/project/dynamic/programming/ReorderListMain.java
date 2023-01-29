package com.temp.project.dynamic.programming;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReorderListMain {
    public void reorderList(ListNode head)    {
        ListNode slow = head;
        System.out.println("Slow is at "+slow.val);
        ListNode fast = slow.next;
        System.out.println("Fast is at "+fast.val);

        int cnt = 0;

        while(fast.next!=null){
            slow = slow.next;
//            System.out.println("Slow is at "+slow.val);
            fast = fast.next;
            if(fast==null) break;
//            System.out.println("Fast skipped "+fast.val);
            fast = fast.next;
            if(fast==null) break;
//            System.out.println("Fast is at "+fast.val);
        }

        //start reversal
        ListNode prev = null;
        ListNode temp = slow.next;
        ListNode ptr = null;

        while(temp!=null){
            ptr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = ptr;
        }

        ListNode head2 = prev;
//        System.out.println(head2.val);
        ptr = head2;
//        while(ptr!=null){
//            System.out.println(ptr.val);
//            ptr = ptr.next;
//        }
        ListNode ptr1 = head;
        ListNode ptr2 = head2;
        ListNode t1 = null;
        ListNode t2 = null;
        while(ptr2!=null){
            t1 = ptr1.next;
            t2 = ptr2.next;
            ptr1.next = ptr2;
            ptr2.next = t1;
            ptr1 = t1;
            ptr2 = t2;
        }
        ptr1.next = null;
//        System.out.println("------------------------");
//        ptr = head;
//        while(ptr!=null){
//            System.out.println(ptr.val);
//            ptr = ptr.next;
        }

//    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        new ReorderListMain().reorderList(head);
    }
}
