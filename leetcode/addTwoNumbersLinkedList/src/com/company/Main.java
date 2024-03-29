package com.company;

//
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//        You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//
//        Example:
//
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.






public class Main {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(5);

        addTwoNumbers(l1,l2);


    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }



    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newNode = new ListNode(0);
        int carry=0;
        ListNode p = l1, q = l2, curr = newNode;




        while(p != null || q != null){
            int x = (p!= null) ? p.val : 0;
            int y = (q!= null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p!= null) p = p.next;
            if (q!= null) q = q.next;

        }

        if (carry > 0){
            curr.next = new ListNode(carry);
        }

        return newNode.next;

    }




}

