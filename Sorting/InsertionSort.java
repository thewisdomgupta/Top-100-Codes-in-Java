//Insertion Sort in Java
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Enter Length of the Array:");
        Scanner vivek = new Scanner(System.in);
        int n = vivek.nextInt();
        System.out.println("Enter Array Elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = vivek.nextInt();
        }
        System.out.println("Entered Array Elements before Sorting is:");
        System.out.println(Arrays.toString(arr));
        //Insertion Sort
        for(int i=0; i<n; i++){
            int temp=arr[i], j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        System.out.println("After Selection Sort the Sorted Array is:");
        System.out.println(Arrays.toString(arr));
    }
}
//This Code is Contributed by Vivek Kumar Gupta
