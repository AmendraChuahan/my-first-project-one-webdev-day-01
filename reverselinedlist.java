package linkedlist;

public class recursived {
    public static void recursive(Node head) {
        if (head == null) {
            return;
        }
        recursive(head.next);
        System.out.println(head.data);

    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        public static void main (String agr[]) {
            Node a = new Node(7);
            Node b = new Node(4);
            Node c = new Node(5);
            Node d = new Node(76);
            a.next = b;
            b.next = c;
            c.next = d;
       recursive(a);
