//package Linked_list;

/**
 * Deletion_of_nth
 */
public class Deletion_of_nth {
    static ListNode head;

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    public void append(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newnode;
    }

    public void printlist() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        System.out.println();
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("NULL");

    }

    public ListNode noRepeat(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        while (curr.next != null) {
            while (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            }
            curr = curr.next;

        }
        return head;
    }

    public ListNode deleteMiddle(ListNode headNode) {
        if (head == null) {
            return null;
        }

        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next == null) {
            ListNode curr = head;
            while (curr.next != slow) {
                curr = curr.next;
            }
            curr.next = slow.next;
        } else if (fast.next.next == null) {
            slow.next = slow.next.next;
        }

        return head;
    }

    // removing the nthnode from last
    public ListNode removeNthNode(ListNode head, int pos) {
        if (head.next == null) {
            return null;
        }
        // counting the size
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        // checking if the position of deleting is equals to the size, then we have to
        // remove the head
        if (pos == size) {
            return head.next;
        }
        // now we check for the real position of the deleting node
        int indextosearch = size - pos;
        ListNode prevnode = head; // we will travers from the head
        int i = 1; // i is the looper
        while (i < indextosearch) { // as long as not in the index we will shift prev to its next
            prevnode = prevnode.next;
            i++;
        }

        prevnode.next = prevnode.next.next; // then we will assign prev's next as prev's next's next, so the connection
                                            // with prev's next will be gone
        return head;
    }

    public static void main(String[] args) {
        Deletion_of_nth list = new Deletion_of_nth();

        list.addfirst(45);
        list.append(34);
        list.addfirst(32);
        list.append(55);
        list.append(11);
        list.append(76);
        list.printlist();
        list.removeNthNode(head, 2); // this will delete from the last of the list
        list.printlist();
        list.deleteMiddle(head);
        list.printlist();

    }
}