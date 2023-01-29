package com.temp.project.dynamic.programming;

public class RemoveNthFromBackMain {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tail = null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextPtr = curr.next;

        if(nextPtr==null) return null;
        // reverse
        while(nextPtr!=null){
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }

        tail = prev;
        short cnt = 1;
        //remove

        ListNode ptr = tail;
        if(n==1){
            tail = tail.next;
        }else{
            //prev = ptr;
            while(cnt<n){
                prev = ptr;
                ptr = ptr.next;
                cnt++;
            }
            prev.next = ptr.next;
        }

//        if(prev!=tail && tail!=ptr){
//        }else{
//            tail.next = ptr.next;
//        }

        ptr = null;

        curr = tail;
        nextPtr = tail;
        prev = null;
        //reverse
        while(nextPtr!=null){
            nextPtr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextPtr;
        }

        head = prev;

        return head;
    }

    public static void main(String[] args) {
        com.temp.project.dynamic.programming.RemoveNthFromBackMain.ListNode head = new com.temp.project.dynamic.programming.RemoveNthFromBackMain.ListNode(1,new com.temp.project.dynamic.programming.RemoveNthFromBackMain.ListNode(2,new com.temp.project.dynamic.programming.RemoveNthFromBackMain.ListNode(3,new com.temp.project.dynamic.programming.RemoveNthFromBackMain.ListNode(4,new com.temp.project.dynamic.programming.RemoveNthFromBackMain.ListNode(5,null)))));

        //RemoveNthFromBackMain.ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,null)));

//        RemoveNthFromBackMain.ListNode head = new ListNode(1,new ListNode(2,null));

        head = new RemoveNthFromBackMain().removeNthFromEnd(head,1);

        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

}


/**
 * Definition for singly-linked list.

 */
