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

    public void detectAndRemoveLoop() {
        if (head == null || head.next == null)
            return; // Empty list or single node list

        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd's Cycle Detection algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }

        // No loop present
        if (slow != fast)
            return;

        // Move slow pointer back to the head and keep the fast pointer at the meeting point
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the loop by setting the next pointer of the last node to null
        fast.next = null;
    }
}

public class Solution_5 {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.insert(1);
        linkedList1.insert(3);
        linkedList1.insert(4);
        linkedList1.head.next.next.next = linkedList1.head.next;
        linkedList1.detectAndRemoveLoop();
        System.out.println("Linked List 1 after removing loop:");
        linkedList1.printList();

        LinkedList linkedList2 = new LinkedList();
        linkedList2.insert(1);
        linkedList2.insert(8);
        linkedList2.insert(3);
        linkedList2.insert(4);
        linkedList2.detectAndRemoveLoop();
        System.out.println("Linked List 2 after removing loop:");
        linkedList2.printList();
    }
}
