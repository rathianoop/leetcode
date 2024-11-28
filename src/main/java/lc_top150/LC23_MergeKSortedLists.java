package lc_top150;

import java.util.PriorityQueue;
import java.util.Queue;

public class LC23_MergeKSortedLists {

    public static void main(String[] args) {
    ListNode node1 = new ListNode(1, new ListNode(4, new ListNode(5)));
    ListNode node2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode node3 = new ListNode(2, new ListNode(6));
    ListNode result = mergeKSorted(new ListNode[]{node1, node2, node3});
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeKSorted(ListNode[] lists) {
        Queue<ListNode> minHeap = new PriorityQueue<>((a,b) -> a.val-b.val);

        for(ListNode node: lists){
            if(node == null) continue;
            minHeap.offer(node);
        }

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(!minHeap.isEmpty()){
            ListNode top = minHeap.poll();
            curr.next = top;
            curr = curr.next;
            if(top.next != null){
             minHeap.offer(top.next);
            }
        }
        return dummy.next;
    }

}

