//Sort an arry of 0s,1s and 2s(Dutch National Flag problem) 
class q4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 0};
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }

        System.out.print("The sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
