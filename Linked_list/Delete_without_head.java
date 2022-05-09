package Linked_list;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    Node head;

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
            System.out.println("There is no list to show");
        }
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("NUll");
    }

    public Object getHead() {
        return this.head;
    }
}

public class Delete_without_head {
    public static void deleteNode(Node node) {
        if (node == null) {
            return;
        }
        if (node.next == null) {
            node = null;
            return;
        }
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addlast(24);
        list.addlast(23);
        list.addlast(25);
        list.addlast(26);
        list.addlast(21);
        list.printlist();

        Node newnode = new Node(25);

        deleteNode(newnode);

        list.printlist();
    }
}
