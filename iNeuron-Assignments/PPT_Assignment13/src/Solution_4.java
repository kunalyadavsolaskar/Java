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

    public Node reverseAlternateKNodes(Node head, int k) {
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        // Reverse the first k nodes
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Skip the next k nodes
        count = 0;
        while (count < k && current != null) {
            prev = current;
            current = current.next;
            count++;
        }

        // Recursively reverse alternate k nodes
        if (current != null) {
            prev.next = reverseAlternateKNodes(current, k);
        }

        return prev;
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

public class Solution_4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);

        int k = 3;

        list.head = list.reverseAlternateKNodes(list.head, k);
        list.display(list.head);
    }
}
