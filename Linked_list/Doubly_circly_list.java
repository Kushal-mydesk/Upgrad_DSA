//package Linked_list;

import java.util.*;

public class Doubly_circly_list {

    static Node head;

    // Creating structure for nodes
    class Node {
        /*
         * Node contains reference to two nodes, one before it and one after it as you
         * do in a doubly linked list
         */
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
        }

        // This method will push the input data at the end of the list
    }

    void push(int data) {
        Node new_node = new Node(data);
        // creating a new node with given data value from the user.
        /*
         * if the head is null then it means for now the list is empty. In this case you
         * should make the new node as head node
         * and since the list to be created is doubly linked and circular linked
         * therefore 'next' and 'prev' node would be the node
         * itself
         */

        if (head == null) {
            new_node.data = data;
            new_node.next = new_node.prev = new_node;
            head = new_node;
            return;
        }
        // When the list is not empty
        else {
            /*
             * To add a node at the end of the list, you have to go to the end of the list
             * and for this you always travel the whole list
             * but in this case the head is bidirectionally linked to the tail of the
             * original list so you can directly jump there.
             */

            Node tail = head.prev;
            // the next of the new_node would point to head
            new_node.next = head;
            // head should also has reference to new_node. The previous of head will point
            // to the new_node.
            head.prev = new_node;

            /*
             * new_node is the new tail of the list since you are adding node at the end of
             * the list. Therefore, the tail of
             * the original list will now become the previous node of the new_node
             */
            new_node.prev = tail;
            // tail's 'next' will now point to the new node
            tail.next = new_node;
        }
    }

    void print() {
        Node temp = head;
        if (head == null) {
            System.out.println(" ");
        } else {
            /*
             * Since the list has properties of circular linked list you have to print the
             * data values till the temp again points to head
             */
            while (temp.next != head) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data + " ");
            /*
             * for printing the data of the list in reverse direction you will start from
             * the tail of the list.
             */
            System.out.println("");
            Node tail = head.prev;
            temp = tail;
            while (temp.prev != tail) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.print(temp.data + " ");
        }
    }

    public static void main(String[] args) {
        Doubly_circly_list obj = new Doubly_circly_list();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            obj.push(in.nextInt());
        }

        obj.print();
        in.close();
    }
}
