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

    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Solution_2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(11);
        list.insert(11);
        list.insert(11);
        list.insert(21);
        list.insert(43);
        list.insert(43);
        list.insert(60);

        list.removeDuplicates();
        list.display();
    }
}
