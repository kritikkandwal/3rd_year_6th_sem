class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at last (manual insertion support)
    public void insertAtLast(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    // Reverse using 2 pointers
    public void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;  // store next
            curr.next = prev;       // reverse
            prev = curr;            // move prev
            curr = next;            // move curr
        }

        head = prev;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class reverse_1 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Manually adding inputs
        list.insertAtLast(10);
        list.insertAtLast(20);
        list.insertAtLast(30);
        list.insertAtLast(40);

        System.out.print("Original list: ");
        list.display();

        list.reverse();

        System.out.print("Reversed list: ");
        list.display();
    }
}
