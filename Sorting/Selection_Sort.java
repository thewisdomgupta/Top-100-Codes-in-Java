//Selection Sort in Java O(N^2) Approach
import java.util.Arrays;
import java.util.Scanner;
public class Selection_Sort {
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
        //Selection Sort
        for(int j=0; j<n; j++){
            int minimumIndex=j;
            for(int i=j+1; i<n; i++ ){
                if(arr[i]<arr[minimumIndex]){
                    minimumIndex=i;
                }
            }
            if(minimumIndex!=j){
                int temp=arr[j];
                arr[j]=arr[minimumIndex];
                arr[minimumIndex]=temp;
            }
        }
        System.out.println("Array Elements after Selection Sorting is:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//This Code is Contributed by Vivek Kumar Gupta
