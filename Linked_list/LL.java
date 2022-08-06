//package Linked_list;

public class LL {
    private static Node head;

    public class Node {
        private String data; // cz it is a String Linked List;
        private Node next;

        Node(String data) {
            this.data = data;
            this.next = null;

        }

    }

    // adding operation, there are two types - addfirst & addlast
    public void addfirst(String data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // adding from the last
    public void addlast(String data) {

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

    // deleting from first
    public void delfirst() {
        if (head == null) {
            System.out.println("No elements left to be deleted");
            return;
        }

        head = head.next;
    }

    // deleting from the last

    public void dellast() {
        if (head == null) {
            System.out.println("NOthing left to delete");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlastnode = head;
        Node lastnode = head.next;

        while (lastnode.next != null) {
            secondlastnode = lastnode;
            lastnode = lastnode.next;

        }

        secondlastnode.next = null;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }

        System.out.println("NULL");
    }

    public void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }
        Node prenode = head;
        Node currnode = head.next;
        while (currnode != null) {
            Node nextnode = currnode.next;
            currnode.next = prenode;

            // updation
            prenode = currnode;
            currnode = nextnode;
        }

        head.next = null;
        head = prenode;

    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newhead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;

    }

    public Node removeNthNode(Node head, int pos) {
        if (head == null) {
            return null;
        }

        // counting size
        int size = 0;
        Node currnode = head;
        while (currnode != null) {
            currnode = currnode.next;
            size++;
        }

        if (pos == size) {
            return head.next;
        }

        int indextosearch = size - pos;
        int i = 1;
        Node prevnode = head;
        while (i < indextosearch) {
            prevnode = prevnode.next;
            i++;
        }

        prevnode.next = prevnode.next.next;
        return head;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();
        list.addlast("list");
        list.printlist();
        list.addfirst("this");
        // list.printlist();
        // list.delfirst();
        // list.printlist();
        // list.delfirst();
        // list.printlist();
        // list.dellast();
        // list.printlist();
        // list.dellast();
        // list.printlist();
        // list.dellast();
        //
        // list.printlist();
        // LL.head = list.reverseRecursive(LL.head);
        // list.printlist();
        // list.removeNthNode(head, 2);
        list.printlist();
        list.reverseIterative();
        list.printlist();

    }

}
