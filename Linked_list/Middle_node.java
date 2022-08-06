//package Linked_list;

public class Middle_node {
    static Node head;

    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node newnode = head;
        while (newnode != null) {
            System.out.print(newnode.data + " -> ");
            newnode = newnode.next;
        }
        System.out.println("NULL");
    }

    public Node find_middle(Node head) {
        Node slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Middle_node ll = new Middle_node();
        ll.addNode(11);
        ll.addNode(12);
        ll.addNode(13);
        ll.addNode(14);
        ll.printlist();
        Node newnode = ll.find_middle(head);
        System.out.println(newnode.data);
    }

}
