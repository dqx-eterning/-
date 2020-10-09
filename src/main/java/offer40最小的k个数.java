import java.lang.reflect.Array;
import java.util.Arrays;

public class offer40最小的k个数 {
    public static void main(String[] args) {

    }
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] arr1 = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
