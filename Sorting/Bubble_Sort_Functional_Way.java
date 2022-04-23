import java.util.Arrays;
import java.util.Scanner;
public class Bubble_Sort_Functional_Way {
    public static void main(String[] args) {
        Scanner vivek = new Scanner(System.in);
        System.out.println("Enter Number of Testcases:");
        int testCases = vivek.nextInt();
        while (testCases > 0) {
            System.out.println("Enter Number of Array Elements:");
            int n = vivek.nextInt();
            System.out.printf("Enter %d Array Elements:", n);
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = vivek.nextInt();

            }
            bubbleSort(arr, n);
            testCases--;
        }
        }
        public static void bubbleSort ( int[] arr, int n){
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }

            }
            System.out.println(Arrays.toString(arr));
        }

    }
//This Code is Contributed by Vivek Kumar Gupta


