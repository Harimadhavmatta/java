package Hash;

import java.util.*;

public class Colors {
    public static void main(String[] args) {
        Hashtable<Character, String> mytable = new Hashtable<Character, String>();
        mytable.put('V', "vilote");
        mytable.put('G', "green");
        mytable.put('O', "orange");
        System.out.println(mytable.get('O'));
        mytable.put('w', "white");
        System.out.println(mytable);
        mytable.remove('V');
        mytable.replace('G', "gold");
        System.out.println(mytable);
        mytable.putIfAbsent('Y', "yellow");
        System.out.println(mytable);
    }
}
