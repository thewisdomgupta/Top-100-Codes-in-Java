import java.util.Arrays;
import java.util.Scanner;
public class Insertion_Sort_Functional_Way {
    public static void main(String [] args){
        Scanner vivek = new Scanner(System.in);
        System.out.println("Enter the Test Cases:");
        int testCases= vivek.nextInt();
        while(testCases>0){
            System.out.println("Enter the Number of Array Element:");
            int n= vivek.nextInt();
            System.out.printf("Enter %d Array Elements:", n);
            int [] arr=new int[n];
            for(int i=0; i<n ; i++){
                arr[i]= vivek.nextInt();
            }
            insertionSort(arr, n);
            testCases--;
        }
    }
    public static void insertionSort(int arr[], int n){
        for(int i=0; i<n; i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println("Sorted Array Element are:");
        System.out.println(Arrays.toString(arr));
    }
}
