package Hasmap;

import java.util.*;

public class Firstmap {

    public static void main(String[] args) {

        // It actually can be used to show a relational data of two types, the datatypes
        // we need to specify should be class name
        HashMap<String, Integer> Empids = new HashMap<>();
        // lets have some look at the functions
        Empids.put("Favdogs", 20); // this will add keys and values
        Empids.put("Superdogs", 35);
        Empids.put("Lazydogs", 50);

        System.out.println(Empids);

        System.out.println(Empids.get("Favdogs")); // it checks for a value of a given key;

        System.out.println(Empids.containsKey("superdogs")); // its for checking if we have that key present in or not,
                                                             // gives boolean value

        System.out.println(Empids.containsValue(35)); // same thing , just checks the value

        // Now to update anything there are two types of methods we can use , 1. put()
        // can be also done, 2.replace()
        // what put() will do that it will update the presented key's value, or if the
        // key is new to hasp then it will also put in
        // replace() can only update a key if its present in that hash,

        Empids.put("Favdogs", 21);
        Empids.replace("supradogo", 35, 34);

        System.out.println(Empids);

        // there also a method putIfAbsent() , it will only do if the key is totally new

        Empids.putIfAbsent("Superdogs", 34);
        System.out.println(Empids);

        Empids.remove("Superdogs"); // for removing any key
        System.out.println(Empids);
    }
}
