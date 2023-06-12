class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node mergeSortedLists(Node head1, Node head2) {
        Node dummyNode = new Node(0);
        Node current = dummyNode;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        }

        if (head2 != null) {
            current.next = head2;
        }

        return dummyNode.next;
    }

    void display(Node head) {
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
        LinkedList list1 = new LinkedList();
        list1.head = new Node(5);
        list1.head.next = new Node(10);
        list1.head.next.next = new Node(15);

        LinkedList list2 = new LinkedList();
        list2.head = new Node(2);
        list2.head.next = new Node(3);
        list2.head.next.next = new Node(20);

        LinkedList mergedList = new LinkedList();
        mergedList.head = mergedList.mergeSortedLists(list1.head, list2.head);
        mergedList.display(mergedList.head);
    }
}
