package Linked_list;

public class Addition_of_nth {
    private static Node head;

    public class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // adding from the last
    public void addlast(int data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }

        currnode.next = newnode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("There is no list present");
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("NULL");
    }

    public Node addition_at_nth(int data, int pos) {
        if (head == null) {
            head = new Node(data);
        }
        int count = 1;
        Node newnode = new Node(data);
        Node currnode = head.next;
        while (count < pos - 1) {
            currnode = currnode.next;
            count++;
        }

        newnode.next = currnode.next;
        currnode.next = newnode;
        return head;
    }

    public static void main(String[] args) {
        Addition_of_nth list = new Addition_of_nth();

        list.addlast(15);
        list.addlast(20);
        list.addlast(22);
        list.addlast(28);
        list.printlist();
        // the pos value should be lesser than the list_size or same
        list.addition_at_nth(25, 4);
        list.printlist();
    }
}
