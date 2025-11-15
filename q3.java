//find the 'kth' maximum and minimum element in an array
import java.util.Arrays;
import java.util.Collections;   
class q3 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 7, 2, 8, -1, 4};
        int k = 3; 

        Arrays.sort(arr, Collections.reverseOrder());

        if (k <= arr.length) {
            int kthMax = arr[k - 1];
            int kthMin = arr[arr.length - k];

            System.out.println(k + "th maximum element is: " + kthMax);
            System.out.println(k + "th minimum element is: " + kthMin);
        } else {
            System.out.println("k is larger than the array size.");
        }
    }
    
}
