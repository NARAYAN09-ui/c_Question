//reverse an arry in place
import java.util.Arrays;
public class q2 {
    public static void main(String[] args) {    
        int[] arr = {3, 5, 7, 2, 8, -1, 4};
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("The reversed array is: " + Arrays.toString(arr));
    }
}