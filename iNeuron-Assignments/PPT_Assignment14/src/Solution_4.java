class Node {
    int data;
    Node next, random;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

class LinkedList {
    Node head;

    Node copyRandomList(Node head) {
        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();
        Node current = head;

        // Create copies of nodes and store mapping in the HashMap
        while (current != null) {
            Node copy = new Node(current.data);
            map.put(current, copy);
            current = current.next;
        }

        // Update next and random pointers of the copied nodes
        current = head;
        while (current != null) {
            Node copy = map.get(current);
            copy.next = map.get(current.next);
            copy.random = map.get(current.random);
            current = current.next;
        }

        return map.get(head);
    }

    void display(Node head) {
        Node current = head;
        while (current != null) {
            int randomData = (current.random != null) ? current.random.data : -1;
            System.out.println("Data: " + current.data + ", Random Data: " + randomData);
            current = current.next;
        }
    }
}

public class Solution_4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        // Setting random pointers
        list.head.random = list.head.next.next;
        list.head.next.random = list.head.next.next.next;
        list.head.next.next.random = list.head.next;

        System.out.println("Original Linked List:");
        list.display(list.head);

        Node result = list.copyRandomList(list.head);

        System.out.println("Copied Linked List:");
        list.display(result);
    }
}
