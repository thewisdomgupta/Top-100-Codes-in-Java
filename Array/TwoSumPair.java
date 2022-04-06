import java.util.Arrays;
import java.util.Scanner;
public class TwoSumPair {
    public static void main(String[] args) {
        System.out.println("Enter Array Length:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Array Elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        System.out.println(Arrays.toString(arr));
        int targetSum = 9;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    count = count + 1;
                }
            }
        }
        System.out.println("Total Number of Pairs whose sum is 9 are:");
        System.out.println(count);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
