import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (this.tail == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }

        this.tail.next = newNode;
        this.tail = newNode;
    }

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }
}

// Class name should be "Source",
// otherwise solution won't be accepted
public class Merge_sorted_list {
    public static Node mergeSortedList(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        Node head = new Node(-1);
        Node newList = head;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                newList.next = l1;
                l1 = l1.next;
            } else {
                newList.next = l2;
                l2 = l2.next;
            }
            newList = newList.next;
        }
        if (l1 != null) {
            newList.next = l1;
        }
        if (l2 != null) {
            newList.next = l2;
        }
        return head.next;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        LinkedList l1 = new LinkedList();
        int i = m;
        while (i > 0) {
            int val = sc.nextInt();
            l1.add(val);
            i--;
        }
        Node head1 = l1.getHead();
        int n = sc.nextInt();
        LinkedList l2 = new LinkedList();
        int j = n;
        while (j > 0) {
            int val = sc.nextInt();
            l2.add(val);
            j--;
        }
        Node head2 = l2.getHead();
        Node head = mergeSortedList(head1, head2);
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}