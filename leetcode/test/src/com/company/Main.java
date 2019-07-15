package com.company;

//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//        Example 1:
//
//        Input: 1->1->2
//        Output: 1->2



public class Main {


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(1);
        a.next.next = new ListNode(1);
        a.next.next.next = new ListNode(4);
        a.next.next.next.next = new ListNode(4);


        deleteDuplicates(a);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public static ListNode deleteDuplicates(ListNode head) {

        ListNode track = head;



        while(track != null && track.next != null){

            if(track.val == track.next.val){
                track.next = track.next.next;
            }else {
                track = track.next;
            }


        }

        return head;
    }

}


