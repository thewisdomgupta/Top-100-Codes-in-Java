import java.util.Arrays;
import java.util.Scanner;
public class Bubble_Sort {
    public static void main(String [] args){
        System.out.println("Enter Length of the Array:");
        Scanner vivek=new Scanner(System.in);
        int n= vivek.nextInt();
        System.out.println("Enter Array Elements:");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= vivek.nextInt();
        }
        System.out.println("Entered Array Elements are before Sorting is::");
        System.out.println(Arrays.toString(arr));
        //Bubble Sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after Sorting is:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
