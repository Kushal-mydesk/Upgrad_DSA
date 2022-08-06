//HashMap is used to store the ke-value pair datas

import java.util.*;

public class Firstmap {

    public static void main(String[] args) {
        // country(key) , population(value)

        HashMap<String, Integer> map = new HashMap<String, Integer>(); // declaring

        // Insertion operation
        map.put("India", 120);
        map.put("US", 80);
        map.put("China", 150);

        // System.out.println(map);

        // Search operation -- to look if the key is present or not
        if (map.containsKey("Nepal")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // Getting the value of a particular key
        String val = map.get("India").toString();
        System.out.println("Value is " + val + " cr");

        // Traversing or iterating over the values

        // 1. through Entryset

        for (Map.Entry<String, Integer> ele : map.entrySet()) {
            System.out.println(ele.getKey() + " : " + ele.getValue());
        }

        // 2.through keyset

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

        // Deletion of any pair

        map.remove("China");
        System.out.println(map);
    }

}
