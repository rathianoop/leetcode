package problems;

import java.util.HashMap;
import java.util.Map;

public class LC143_ReorderList {

    public void reorderList(ListNode head) {

        ListNode prev = null;
        ListNode temp = head;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l2 = slow;
        prev.next = null;
        l2 = reverse(l2);


        merge(temp, l2);

        System.out.println("temp"+temp);



    }

    public void merge( ListNode l1, ListNode l2){

        int[] array = new int[2];

        while(l1 != null){
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;
            l1.next = l2;

            if(l1Next == null){
                break;
            }
            l2.next = l1Next;
            l1 = l1Next;
            l2 = l2Next;
        }



    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode currentNode = head;
        while(currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }
        return prev;
    }




    public static void main(String[] args) {
        LC143_ReorderList lc143ReorderList = new LC143_ReorderList();

        ListNode listNode = lc143ReorderList.new ListNode(1);
        ListNode listNode2 = lc143ReorderList.new ListNode(2);
        ListNode listNode3 = lc143ReorderList.new ListNode(3);
        ListNode listNode4 = lc143ReorderList.new ListNode(4);
        ListNode listNode5 = lc143ReorderList.new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        lc143ReorderList.reorderList(listNode);

    }








    class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
