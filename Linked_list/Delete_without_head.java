package Linked_list;

class Nodemode {
    int data;
    Nodemode next;

    Nodemode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    Nodemode head;

    public void addlast(int data) {

        Nodemode newnode = new Nodemode(data);
        if (head == null) {
            head = newnode;
            return;
        }

        Nodemode currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }

        currnode.next = newnode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("There is no list to show");
        }
        Nodemode currnode = head;
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
    public static void deleteNode(Nodemode node) {
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

        Nodemode newnode = new Nodemode(25);

        deleteNode(newnode);

        list.printlist();
    }
}
