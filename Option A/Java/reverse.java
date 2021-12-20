import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] input = in.split(" ");

        String[] result = reverse(input);

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[j] = array[i];
            j++;
        }
        return reverseArray;
    }
}
