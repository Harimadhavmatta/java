import java.util.Arrays;

public class Ruf {
    public static void main(String[] args) {
        String sc = "10 20 30 40";
        String[] lis = sc.split(" ");
        // System.out.println(Arrays.toString(lis));
        String ele = lis[0];
        System.out.println(Integer.parseInt(ele) + 1);
    }
}