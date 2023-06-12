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

    public static LinkedList createNewList(LinkedList list1, LinkedList list2) {
        LinkedList newList = new LinkedList();

        Node ptr1 = list1.head;
        Node ptr2 = list2.head;

        while (ptr1 != null && ptr2 != null) {
            int value1 = ptr1.data;
            int value2 = ptr2.data;

            if (value1 >= value2) {
                newList.insert(value1);
            } else {
                newList.insert(value2);
            }

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        while (ptr1 != null) {
            newList.insert(ptr1.data);
            ptr1 = ptr1.next;
        }

        while (ptr2 != null) {
            newList.insert(ptr2.data);
            ptr2 = ptr2.next;
        }

        return newList;
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

public class Solution_1 {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(5);
        list1.insert(2);
        list1.insert(3);
        list1.insert(8);

        LinkedList list2 = new LinkedList();
        list2.insert(1);
        list2.insert(7);
        list2.insert(4);
        list2.insert(5);

        LinkedList newList = LinkedList.createNewList(list1, list2);
        newList.display();
    }
}
