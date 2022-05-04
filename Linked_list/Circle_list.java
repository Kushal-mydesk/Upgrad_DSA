package Linked_list;

public class Circle_list {
    static Node head;

    class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

    }

    public void setNext(Node node) {
        node.next = head;
    }

    public void addnode(int data) {
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
            System.out.print(newnode.val + " -> ");
            newnode = newnode.next;
        }
        System.out.println("NUll");
    }

    public boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }

        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;

            if (turtle == hare) {
                return true;
            }
        }

        return false;
    }

    public Node startOfloop(Node node) {
        if (head == null || head.next == null) {
            return null;
        }
        Node first = head, slow = head, fast = head;
        boolean hasloop = false;

        while (fast.next != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast.val == slow.val) {
                hasloop = true;
                break;
            }
        }

        if (!hasloop) {
            return null;
        } else {
            Node second = slow;
            while (first.val != second.val) {
                first = first.next;
                second = second.next;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        Circle_list ll = new Circle_list();
        ll.addnode(12);
        ll.addnode(13);
        ll.addnode(14);
        ll.addnode(11);
        ll.addnode(15);
        ll.printlist();
        ll.setNext(head.next);
        Node ll2 = ll.startOfloop(head);
        System.out.println(ll2.val);

    }
}
