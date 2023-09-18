package Arrays;
public class ReverseArray {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] reverseArr(int[] arr) {
        int[] res = new int[arr.length];
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[idx] = arr[i];
            idx++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 11, 5, 10, 7, 8 };
        printArray(arr);
        int[] res = reverseArr(arr);
        printArray(res);
    }
}
