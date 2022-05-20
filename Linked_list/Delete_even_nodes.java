package Linked_list;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linked_list {
    Node head;
    Node tail;

    Linked_list() {
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
        newNode.next = this.head;
    }

    public Node getHead() {
        return this.head;
    }

    public void printList() {
        Node temp = this.head.next;
        if (temp == null) {
            return;
        }
        System.out.println(this.head.data);
        while (temp != this.head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

/**
 * Delete_even_nodes
 */
public class Delete_even_nodes {

    public static void deleteNode(Node head, Node delNode) {
        if (head == delNode) {
            head = delNode.next;
        }

        Node temp = head;
        while (temp.next != delNode) {
            temp = temp.next;
        }
        temp.next = delNode.next;

    }

    public static Node deleteEvenNodes(Node head) {
        Node temp = head;

        do {
            if (temp.data % 2 == 0) {
                deleteNode(head, temp);
            }
            temp = temp.next;
        } while (temp != head);

        return head;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Linked_list list = new Linked_list();

        while (n > 0) {
            list.push(sc.nextInt());
            n--;
        }

        deleteEvenNodes(list.getHead());
        list.printList();
        sc.close();
    }
}
