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

    Node addOne(Node head) {
        Node reversedHead = reverseLinkedList(head);
        Node current = reversedHead;
        int carry = 1;

        while (current != null) {
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;

            if (carry == 0)
                break;

            current = current.next;
        }

        if (carry > 0) {
            Node newHead = new Node(carry);
            newHead.next = reversedHead;
            return newHead;
        } else {
            return reverseLinkedList(reversedHead);
        }
    }

    Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }
}

public class Solution_2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(4);
        list.head.next = new Node(5);
        list.head.next.next = new Node(6);

        System.out.println("Original Linked List:");
        list.display(list.head);

        Node result = list.addOne(list.head);

        System.out.println("Linked List after adding 1:");
        list.display(result);
    }
}
