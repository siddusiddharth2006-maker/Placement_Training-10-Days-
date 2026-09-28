class Binary {

    static int binary(int[] arr, int target) {

        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 9, 3, 3, 4, 9};
        int target = 3;
        int result = Binary.binary(arr, target);
        if (result != -1) {
            System.out.println("Found at Index: " + result);
        }
        else {
            System.out.println("Not Found");
        }
    }
}