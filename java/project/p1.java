package project;

import java.util.*;

public class p1 {
    static int discount(int p, int l) {
        int a = p / 10;
        if (a > l) {
            return l;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of bills : ");
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String> userMap1 = new HashMap<>();
        HashMap<String, String> userMap2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the total bill amount: ");
            int purchase = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            System.out.print("Enter user ID: ");
            String user = sc.nextLine();

            System.out.print("Enter item category: ");
            String item = sc.nextLine();
            int limit = 700;
            int discount = discount(purchase, limit);
            String input = item + "." + discount + "." + user;
            int shift = 4;
            String encrypted = encrypt(input, shift);
            System.out.println("Encrypted: " + encrypted);
            userMap1.put(encrypted, item + " with discount: " + discount);
            userMap2.put(encrypted, user);
            String decrypted = decrypt(encrypted, shift);
            System.out.println("Decrypted: " + decrypted);
            System.out.println("...................................");
        }
        generateList(userMap1);
        System.out.print("Enter encrypted key to get discount: ");
        String encryptedKey = sc.nextLine();
        getDiscount(userMap1, encryptedKey);
        System.out.println("......................................");
        generateList(userMap1);
        System.out.println("......................................");
        usercoupons("hari", userMap2);
        System.out.println("......................................");

    }

    public static void usercoupons(String User, HashMap<String, String> map) {
        System.out.println("coupon list of " + User);
        for (String i : map.keySet()) {
            // System.out.println(i);
            String x = map.get(i);
            // System.out.println(x + " ++ " + User);
            if (x.equals(User)) {
                // System.out.println(i);
                System.out.println(i);
            }
        }
    }

    public static void generateList(HashMap<String, String> map) {
        System.out.println("Generated List: ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void getDiscount(Map<String, String> map, String encryptedKey) {
        String result = map.get(encryptedKey);
        map.remove(encryptedKey);
        if (result != null) {

            System.out.println("Discount details: " + result);
        } else {
            System.out.println("No details found for the provided key.");
        }
    }

    public static String encrypt(String input, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char i : input.toCharArray()) {
            if (Character.isLetter(i)) {
                char base = Character.isUpperCase(i) ? 'A' : 'a';
                encrypted.append((char) ((i - base + shift) % 26 + base));
            } else {
                encrypted.append(i);
            }
        }

        return encrypted.toString();
    }

    public static String decrypt(String input, int shift) {
        return encrypt(input, 26 - shift);
    }
}
