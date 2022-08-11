import java.util.HashSet;
import java.util.Iterator;

//It is a data set that doesnot allow to have duplicate values,
//and in every action we need to perform can be done in O(1) complexity

public class FirstSet {

    public static void main(String args[]) {
        // Creation of the Set
        HashSet<Integer> set = new HashSet<>();

        // Inserting the datas
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search
        // We can only return the Boolean result of the value if it contains or not

        if (set.contains(1)) {
            System.out.println("The value of the element is present");
        } else {
            System.out.println("The value of the element is not present");

        }

        // removing the elements
        // It can by donw by the remove() method
        set.remove(2);
        // to check if its got deleted or not
        if (!set.contains(2)) {
            System.out.println("The value of the element is not present");

        } else {
            System.out.println("We could not delete it");
        }

        // To iterate over the set we need to have a special solution for the set
        // as it does not have any index to iterate with, we have to iterate through
        // "The Iterator"

        Iterator it = set.iterator(); // set has this special method that returns a position ,
                                      // we stored it in a value named "it" which"Iterator" type

        // the specail method

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // to print all the elements in the set
        System.out.println(set);

    }
}