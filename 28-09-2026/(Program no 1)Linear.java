class Linear {
    static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 10, 15};
        int target = 8;
        int result = Linear.linear(arr, target);
        if (result != -1) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Not Found");
        }
    }
}
