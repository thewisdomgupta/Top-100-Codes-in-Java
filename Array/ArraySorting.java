import java.util.Arrays;
import java.util.Scanner;
public class ArraySorting {
    public static void main(String [] args){
        System.out.println("Enter the Size of the Array:");
        Scanner vivek=new Scanner(System.in);
        int n= vivek.nextInt();
        System.out.println("Enter the Array Elements:");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= vivek.nextInt();
        }
        System.out.println("Array Before Sorting is:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array After Sorting is:");
        System.out.println(Arrays.toString(arr));
    }
}
//This Code is Contributed by Vivek Kumar Gupta
