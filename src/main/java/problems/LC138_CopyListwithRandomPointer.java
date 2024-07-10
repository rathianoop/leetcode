package problems;

import java.util.HashMap;
import java.util.Map;

public class LC138_CopyListwithRandomPointer {

    public Node copyRandomList(Node head) {

        Node temp = head;
        Map<Node, Node> nodeMap = new HashMap();

        while(temp != null){
            nodeMap.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        for(Node node : nodeMap.keySet()){
            nodeMap.get(node).next = node.next;
            nodeMap.get(node).random = node.random;
        }

        return nodeMap.get(head);
    }

    public static void main(String[] args) {
        LC138_CopyListwithRandomPointer lc138CopyListwithRandomPointer = new LC138_CopyListwithRandomPointer();
        Node callingNode_7 = lc138CopyListwithRandomPointer.new Node(7);
        Node callingNode_13 = lc138CopyListwithRandomPointer.new Node(13);
        Node callingNode_11 = lc138CopyListwithRandomPointer.new Node(11);
        Node callingNode_4 = lc138CopyListwithRandomPointer.new Node(4);
        Node callingNode_10 = lc138CopyListwithRandomPointer.new Node(10);
        Node callingNode_1 = lc138CopyListwithRandomPointer.new Node(1);

        callingNode_7.next = callingNode_13;
        callingNode_7.random = null;
        callingNode_13.next = callingNode_11;
        callingNode_13.random = callingNode_7;
        callingNode_11.next = callingNode_10;
        callingNode_11.random = callingNode_1;
        callingNode_10.next = callingNode_1;
        callingNode_10.random = callingNode_11;
        callingNode_1.next = null;
        callingNode_1.random = callingNode_7;

        lc138CopyListwithRandomPointer.copyRandomList(callingNode_7);
    }




    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
