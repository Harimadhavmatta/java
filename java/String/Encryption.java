public class Encryption {
    public static void main(String[] args) {
        // String s = "zku?/u?/s?/sm??zuum/=/mefm";
        String s = "this is my password : abcd";
        for (int i = 0; i < s.length(); i++) {
            int v = (int) (s.charAt(i)) + 3;
            char c = (char) v;
            s = s.replace(s.charAt(i), c);
            // System.out.println(v);
        }
        System.out.println(s);

    }
}
