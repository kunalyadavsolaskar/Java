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
    Node tail;

    void deleteNodeAtPosition(int position) {
        if (position < 1)
            return;

        Node current = head;
        int currentPosition = 1;

        while (current != null && currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        if (current == null)
            return;

        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next;

        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev;

        current.prev = null;
        current.next = null;
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

public class Solution_8 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(5);
        list.head.next.prev = list.head;
        list.head.next.next = new Node(2);
        list.head.next.next.prev = list.head.next;
        list.head.next.next.next = new Node(9);
        list.head.next.next.next.prev = list.head.next.next;

        System.out.println("Original Doubly Linked List:");
        list.display();

        int position = 1;
        list.deleteNodeAtPosition(position);

        System.out.println("Doubly Linked List after deleting node at position " + position + ":");
        list.display();
    }
}
