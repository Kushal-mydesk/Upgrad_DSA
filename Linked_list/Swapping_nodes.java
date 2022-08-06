
/**
 * Description

Given a linked list, swap every two adjacent nodes and return its head.

You can consider, the length of the given linked list will always be even.


Note: Do not change the value in the list nodes.


First line of the input takes N (Number of nodes).

Second line of the input takes N nodes.


Input:

4

1 2 3 4


Output:

2

1

4

3
 */

import java.util.*;

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

    public void push(int n) {
        Node newNode = new Node(n);
        if (this.tail == null) {
            this.tail = newNode;
            this.head = newNode;
            return;
        }

        this.tail.next = newNode;
        this.tail = newNode;
    }

    public Node getHead() {
        return this.head;
    }
}

// Class name should be "Source",
// otherwise solution won't be accepted
public class Swapping_nodes {
    public static Node swapNodes(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        while (current.next != null && current.next.next != null) {
            Node first = current.next;
            Node second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return dummy.next;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList();

        while (n > 0) {
            list.push(sc.nextInt());
            n--;
        }

        Node newList = swapNodes(list.getHead());
        while (newList != null) {
            System.out.println(newList.data);
            newList = newList.next;
        }
        sc.close();
    }
}