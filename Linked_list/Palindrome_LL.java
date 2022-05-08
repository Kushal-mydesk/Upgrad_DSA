package Linked_list;

/**
 * Palindrome_LL
 */
public class Palindrome_LL {

    static Node head;

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
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

    public void append(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newnode;
    }

    public void printlist() {
        if (head == null) {
            return;
        }
        Node curNode = head;

        while (curNode != null) {
            System.out.print(curNode.val + " -> ");
            curNode = curNode.next;
        }
        System.out.println("NUll");
    }

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = findMiddle(head);
        Node secondhalfstart = reverse(middle.next);

        Node firsthalfStart = head;
        while (secondhalfstart != null) {
            if (firsthalfStart.val != secondhalfstart.val) {
                return false;
            }
            firsthalfStart = firsthalfStart.next;
            secondhalfstart = secondhalfstart.next;
        }

        return true;
    }

    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node newnext = curr.next;

            curr.next = prev;
            prev = curr;
            curr = newnext;
        }
        return prev;
    }

    public Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;

        while (hare.next != null && hare.next.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }

        return turtle;
    }

    public static void main(String[] args) {
        Palindrome_LL list = new Palindrome_LL();
        list.printlist();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printlist();
        if (list.isPalindrome(head)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

    }

}