package Linked_list;

import java.util.*;

/**
 * Divide_circular
 */
public class Divide_circular {

    static Node head;
    static Node h1, h2;

    static class Node {
        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    void divide() {
        Node slw_ptr = head;
        Node fast_ptr = head;

        // when the list is empty
        if (head == null) {
            System.out.println(" ");
        } else if (head.next == head) {
            System.out.println("NA");
        } else {
            /*
             * When the number of nodes is even fast_ptr.next.next will become head but
             * when the number of nodes is odd then fast_ptr.next will become head
             */

            /*
             * Below given while loop will run till the fast pointer does not points to head
             * again.
             */
            while (fast_ptr.next != head && fast_ptr.next.next != head) {
                fast_ptr = fast_ptr.next.next;
                slw_ptr = slw_ptr.next;
            }

            /*
             * fast_ptr.next.next is compared with head. If the number of nodes is even this
             * condition will be true and as mentioned fast_ptr will store the position of
             * end node
             */

            if (fast_ptr.next.next == head) {
                fast_ptr = fast_ptr.next; // this means that we have our fast pointer at the last node
            }

            /* Set the first head as the original head */
            h1 = head;

            /* Set the head pointer of second half */

            h2 = slw_ptr.next;

            /* Make second half circular */
            fast_ptr.next = slw_ptr.next; // now we are making the last node point the next-middle node

            /* Make first half circular */
            slw_ptr.next = head; // and the next-middle node will again point to head;
        }
    }

    // Method to add nodes at the end of the list
    public void push(int new_data) {
        Node temp = head;
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            new_node.next = head;
        } else {
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
        }
    }

    // Method to print data value of nodes of the linked list
    void print(Node temp) {
        Node node = temp;
        if (temp != null) {
            do {
                System.out.print(node.data + " ");
                node = node.next;
            } while (node != temp);
        }
    }

    public static void main(String[] args) {
        Divide_circular list = new Divide_circular();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.push(in.nextInt());
        }
        list.divide();
        System.out.println("");
        list.print(h1);
        System.out.println("");
        list.print(h2);
        in.close();
    }
}