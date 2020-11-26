package cracking_code_interview.linkedlist;

import java.util.Hashtable;

public class RemoveDups_2_1 {
    static class LinkedListNode {
        String data;
        LinkedListNode next;
    }
    public static void main(String[] args) {
        LinkedListNode node1 = new LinkedListNode();
        LinkedListNode node2 = new LinkedListNode();
        LinkedListNode node3 = new LinkedListNode();
        LinkedListNode node4 = new LinkedListNode();
        LinkedListNode node5 = new LinkedListNode();
        LinkedListNode node6 = new LinkedListNode();
        LinkedListNode node7 = new LinkedListNode();

        node1.data = "hi";
        node1.next = node2;

        node2.data = "sabi";
        node2.next = node3;

        node3.data = "hello";
        node3.next = node4;

        node4.data = "welcome";
        node4.next = node5;

        node5.data = "sabi";
        node5.next = node6;

        node6.data = "hi";
        node6.next = node7;

        node7.data = "end";

        System.out.println("List before delete dublicated : ");
        printNodes(node1);
        System.out.println();
        deleteDub(node1);
        System.out.println("List after delete dublicated : ");
        printNodes(node1);
    }

    public static void printNodes (LinkedListNode node)
    {
        for(LinkedListNode x = node ; x .next != null; x = x.next)
        {
            System.out.print(x.data + " ");
        }
    }
    public static void deleteDub(LinkedListNode n) {
        Hashtable table = new Hashtable();
        LinkedListNode previous = null;
        while (n != null) {
            if (table.containsKey(n.data)) {
                previous.next = n.next;
            } else {
                table.put(n.data, true);
                previous = n;
            }
            n = n.next;
        }
    }
}
