package bags_queues_stacks_1_3section;

public class LinkedListImpl {

    public static class Node {
        String item;
        Node next;

        public Node() {
        }
    }

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.item = "to";
        first.next = second;

        second.item = "be";
        second.next = third;

        third.item = "or";

        // first = first.next;

        Node oldfirst = first;
        first = new Node();
        first.item = "not";
        first.next = oldfirst;

        Node oldlast = third;
        third = new Node();
        third.item = "hdbdbh";
        oldlast.next = third;


        for (Node x = first; x != null; x = x.next) {
            System.out.println(x.item);
        }
    }
}
