
import java.util.*;

public class Modern_list {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();
        // using collection framworks functions
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        System.out.println(list);
        list.addFirst("This");
        System.out.println(list);
        // for printing out the size
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        // deleting elements from list

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        // deleting by index

        list.remove(1);
        System.out.println(list);

    }
}
