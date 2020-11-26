package cracking_code_interview.linkedlist;

public class LinkedListImplementation {
   public static class Node{
        Node next;
        String item;

        public Node(){}
    }

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.item = "Hello, ";
        first.next = second;

        second.item = "Sabiii.";
        second.next = third;

        third.item = "Welcome!";

//        Node oldfirst = first;
//        first = new Node();
//        first.item = "New First Node inserted";
//        first.next = oldfirst;

//        Node oldlast = third;
//        third = new Node();
//        third.item = "New last node insterted";
//        oldlast.next = third;



        for (Node x = first; x != null; x = x.next) {
            System.out.println(x.item);
        }
    }
}
