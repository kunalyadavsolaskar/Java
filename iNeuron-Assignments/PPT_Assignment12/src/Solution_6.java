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

    public void retainDelete(int M, int N) {
        if (head == null || M <= 0 || N <= 0)
            return;

        Node current = head;
        Node prev;
        int count;

        while (current != null) {
            // Retain M nodes
            for (count = 1; count < M && current != null; count++) {
                current = current.next;
            }

            // No more nodes to retain
            if (current == null)
                return;

            prev = current;
            current = current.next;

            // Delete N nodes
            for (count = 1; count <= N && current != null; count++) {
                Node nextNode = current.next;
                current = nextNode;
            }

            // Update the next pointer of prev to skip the deleted nodes
            prev.next = current;
        }
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

public class Solution_6 {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.insert(1);
        linkedList1.insert(2);
        linkedList1.insert(3);
        linkedList1.insert(4);
        linkedList1.insert(5);
        linkedList1.insert(6);
        linkedList1.insert(7);
        linkedList1.insert(8);
        linkedList1.retainDelete(2, 2);
        System.out.println("Linked List 1 after retain-delete:");
        linkedList1.printList();

        LinkedList linkedList2 = new LinkedList();
        linkedList2.insert(1);
        linkedList2.insert(2);
        linkedList2.insert(3);
        linkedList2.insert(4);
        linkedList2.insert(5);
        linkedList2.insert(6);
        linkedList2.insert(7);
        linkedList2.insert(8);
        linkedList2.insert(9);
        linkedList2.insert(10);
        linkedList2.retainDelete(3, 2);
        System.out.println("Linked List 2 after retain-delete:");
        linkedList2.printList();

        LinkedList linkedList3 = new LinkedList();
        linkedList3.insert(1);
        linkedList3.insert(2);
        linkedList3.insert(3);
        linkedList3.insert(4);
        linkedList3.insert(5);
        linkedList3.insert(6);
        linkedList3.insert(7);
        linkedList3.insert(8);
        linkedList3.insert(9);
        linkedList3.insert(10);
        linkedList3.retainDelete(1, 1);
        System.out.println("Linked List 3 after retain-delete:");
        linkedList3.printList();
    }
}
