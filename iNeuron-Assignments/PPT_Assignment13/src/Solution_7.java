class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    void reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            current.prev = next;
            previous = current;
            current = next;
        }

        head = previous;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Solution_7 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.head = new Node(10);
        list.head.next = new Node(8);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(2);

        System.out.println("Original Linked List:");
        list.display();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.display();
    }
}
