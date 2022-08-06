class exercise {
    public static node head;
    public int size = 0;

    class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void insertfirst(int val) {
        node Node = new node(val);
        if (head == null) {
            head = Node;
            size++;
            return;
        }

        Node.next = head;
        head = Node;
        size++;
    }

    public void insertlast(int val) {
        node Node = new node(val);

        if (head == null) {
            head = Node;
            size++;
            return;
        }

        node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }

        currnode.next = Node;
        size++;
    }

    public void delfirst() {
        if (head == null) {
            System.out.println("There is no head!");
            return;
        }

        head = head.next;
        size--;
    }

    public void dellast() {
        if (head == null) {
            System.out.println("There is no head!");
            return;
        }

        node currnode = head;
        while (currnode.next.next != null) {
            currnode = currnode.next;
        }

        currnode.next = null;
        size--;
    }

    public void del_kth_ele(int pos) {
        if (head == null) {
            System.out.println("There is no head!");
        }

        node currnode = head;
        for (int k = 1; k < pos - 1; k++) {
            currnode = currnode.next;
        }
        currnode.next = currnode.next.next;

    }

    public void displayList() {
        if (head == null) {
            System.out.println("There is no head!");
            return;
        }

        node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;
        }
        System.out.println("Null");
    }

    public int getSize() {
        return size;
    }
}

class Main {

    public static void main(String[] args) {
        exercise list = new exercise();
        list.insertfirst(4);
        list.displayList();
        list.insertlast(5);
        list.displayList();
        list.insertfirst(3);
        list.insertfirst(7);
        list.insertfirst(5);
        list.insertfirst(3);
        list.insertfirst(2);
        list.displayList();
        System.out.println(list.getSize());
        // list.delfirst();
        list.displayList();
        list.del_kth_ele(6);
        // list.dellast();
        list.displayList();
    }
}