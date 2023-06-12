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

    public void insertAlternate(LinkedList secondList) {
        if (secondList.head == null) {
            return;
        }

        Node current1 = head;
        Node current2 = secondList.head;

        while (current1 != null && current2 != null) {
            Node next1 = current1.next;
            Node next2 = current2.next;

            current1.next = current2;
            current2.next = next1;

            current1 = next1;
            current2 = next2;
        }

        if (current2 != null) {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = current2;
        }

        secondList.head = null; // Empty the second list
    }

    public void printList() {
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
        LinkedList firstList = new LinkedList();
        firstList.insert(5);
        firstList.insert(7);
        firstList.insert(17);
        firstList.insert(13);
        firstList.insert(11);

        LinkedList secondList = new LinkedList();
        secondList.insert(12);
        secondList.insert(10);
        secondList.insert(2);
        secondList.insert(4);
        secondList.insert(6);

        firstList.insertAlternate(secondList);

        System.out.println("First List after alternate insertion:");
        firstList.printList();

        System.out.println("Second List after alternate insertion:");
        secondList.printList();
    }
}
