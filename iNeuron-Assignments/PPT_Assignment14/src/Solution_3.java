class Node {
    int data;
    Node next;
    Node bottom;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

class LinkedList {
    Node head;

    Node merge(Node a, Node b) {
        if (a == null)
            return b;

        if (b == null)
            return a;

        Node result;

        if (a.data < b.data) {
            result = a;
            result.bottom = merge(a.bottom, b);
        } else {
            result = b;
            result.bottom = merge(a, b.bottom);
        }

        result.next = null;
        return result;
    }

    Node flatten(Node head) {
        if (head == null || head.next == null)
            return head;

        // Recursively flatten the rest of the main linked list
        head.next = flatten(head.next);

        // Merge the flattened main linked list with the first sub-linked list
        head = merge(head, head.next);

        return head;
    }

    void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "-> ");
            current = current.bottom;
        }
        System.out.println("null");
    }
}

public class Solution_3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(5);
        list.head.next = new Node(10);
        list.head.next.next = new Node(19);
        list.head.next.next.next = new Node(28);

        list.head.bottom = new Node(7);
        list.head.next.bottom = new Node(20);
        list.head.next.next.bottom = new Node(22);
        list.head.next.next.next.bottom = new Node(35);

        list.head.bottom.bottom = new Node(8);
        list.head.next.bottom.bottom = new Node(50);
        list.head.next.next.bottom.bottom = new Node(40);

        list.head.bottom.bottom.bottom = new Node(30);
        list.head.next.bottom.bottom.bottom = new Node(45);

        System.out.println("Original Linked List:");
        list.display(list.head);

        Node result = list.flatten(list.head);

        System.out.println("Flattened Linked List:");
        list.display(result);
    }
}
