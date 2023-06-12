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

    void detectAndRemoveLoop() {
        if (head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head;

        // Detect the loop using Floyd's cycle-finding algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        // If there is no loop, return the list as it is
        if (slow != fast)
            return;

        // Move slow back to the head and keep fast at the meeting point
        slow = head;

        // Move both pointers one step at a time until they meet again
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the loop by making the next pointer of the node just before the start of the loop point to null
        fast.next = null;
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

public class Solution_1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(3);
        list.head.next.next = new Node(4);
        list.head.next.next.next = list.head.next; // Creating a loop by connecting the last node to the second node

        System.out.println("Original Linked List:");
        list.display();

        list.detectAndRemoveLoop();

        System.out.println("Linked List after removing the loop:");
        list.display();
    }
}
