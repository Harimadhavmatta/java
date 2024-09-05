import java.util.*;

public class String1 {
    public static void main(String args[]) {
        String s1 = "we all are fine";
        String s2 = "we are also fine";
        System.out.println(s1.length()); // to find length of s1
        System.out.println(s1.indexOf("all")); // gives start index of the string in s1 if present
        System.out.println(s1.substring(3, 6)); // gets charactes from index 3 to 6(3,4,5)
        s1.toLowerCase(); // this line will return value (we all are fine) but will not update it to s1
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        // word input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word : ");
        String word = sc.nextLine();
        System.out.println("enter a sentence : ");
        String sentence = sc.next();
        System.out.println(word);
        System.out.println(sentence);
        System.out.println(s1.concat(" what about you"));
        char[] lis = s1.toCharArray();
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.contains("rtr"));

        // System.out.println(lis.toString());
        // for (int i = 0; i < lis.length; i++) {
        // System.out.println(lis[i]);
        // }

    }
}