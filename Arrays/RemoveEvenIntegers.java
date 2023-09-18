package Arrays;
public class RemoveEvenIntegers {
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        int res[] = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                res[idx] = arr[i];
                idx++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
        printArray(arr);
        int[] res = removeEven(arr);
        printArray(res);
    }
}