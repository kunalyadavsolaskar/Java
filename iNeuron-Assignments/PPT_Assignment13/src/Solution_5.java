class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node deleteLastOccurrence(Node head, int key) {
        Node lastOccurrence = null;
        Node prevLastOccurrence = null;
        Node current = head;
        Node prev = null;

        // Find the last occurrence of the key and its previous node
        while (current != null) {
            if (current.data == key) {
                lastOccurrence = current;
                prevLastOccurrence = prev;
            }
            prev = current;
            current = current.next;
        }

        // If the key is not found, return the original list
        if (lastOccurrence == null) {
            return head;
        }

        // If last occurrence is the head, update the head
        if (lastOccurrence == head) {
            head = head.next;
        } else {
            prevLastOccurrence.next = lastOccurrence.next;
        }

        return head;
    }

    public void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Solution_5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(2);
        list.insert(10);

        int key = 2;

        list.head = list.deleteLastOccurrence(list.head, key);
        list.display(list.head);
    }
}
