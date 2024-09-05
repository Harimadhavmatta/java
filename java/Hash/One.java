package Hash;

import java.util.*;

public class One {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
        // put(key,value), get(key), remove(key),putIfAbsent(key,value)
        table.put(1, 100);
        table.put(2, 200);
        table.put(3, 300);
        table.put(4, 400);
        // table.put(4, 450); //to edit the existing key's value (use put)
        table.put(200, 444);
        System.out.println(table);
        table.remove(200);
        System.out.println(table);
        table.putIfAbsent(399, 333);
        table.putIfAbsent(4, 444);
        System.out.println(table);
        System.out.println(table.get(3));
        table.replace(3, 33);
        System.out.println(table);
        // table.merge(null, null, null)

    }
}
