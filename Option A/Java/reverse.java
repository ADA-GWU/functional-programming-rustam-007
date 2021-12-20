import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // as in Java, you need to specify array length I take n as input for array's length
        int[] input = new int[n];
        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        int[] result = reverse(input);

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[j] = array[i];
            j++;
        }
        return reverseArray;
    }
}
