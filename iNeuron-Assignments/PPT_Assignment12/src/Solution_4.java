class Node {
    char data;
    Node next;

    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(char data) {
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

    public boolean isPalindrome() {
        if (head == null || head.next == null)
            return true; // Empty list or single node list is a palindrome

        Node slow = head;
        Node fast = head;
        Node prevSlow = null;
        Node midNode = null;
        boolean isPalindrome = true;

        // Move the fast pointer two steps ahead and the slow pointer one step ahead
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;
        }

        // If the linked list has odd length, move the slow pointer one step ahead
        if (fast != null) {
            midNode = slow;
            slow = slow.next;
        }

        // Reverse the second half of the linked list
        Node secondHalf = slow;
        prevSlow.next = null;
        Node prev = null;
        Node current = secondHalf;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;

        // Compare the first half with the reversed second half
        Node firstHalf = head;
        while (firstHalf != null && secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Restore the original list by reversing the second half again
        prev = null;
        current = prevSlow.next;
        prevSlow.next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        prevSlow.next = prev;

        // If the linked list had odd length, restore the connection with the midNode
        if (midNode != null) {
            prevSlow.next = midNode;
            midNode.next = secondHalf;
        } else {
            prevSlow.next = secondHalf;
        }

        return isPalindrome;
    }
}

public class Solution_4 {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.insert('R');
        linkedList1.insert('A');
        linkedList1.insert('D');
        linkedList1.insert('A');
        linkedList1.insert('R');
        boolean isPalindrome1 = linkedList1.isPalindrome();
        System.out.println("Is Palindrome 1: " + isPalindrome1);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.insert('C');
        linkedList2.insert('O');
        linkedList2.insert('D');
        linkedList2.insert('E');
        boolean isPalindrome2 = linkedList2.isPalindrome();
        System.out.println("Is Palindrome 2: " + isPalindrome2);
    }
}
