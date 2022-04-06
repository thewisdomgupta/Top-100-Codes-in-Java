import java.util.Arrays;
import java.util.Scanner;

public class MaximumSum {
    public static void main(String [] args){
        System.out.println("Enter the Length of Array:");
        Scanner vivek=new Scanner(System.in);
        int n=vivek.nextInt();
        System.out.println("Enter the Elements of Array:");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=vivek.nextInt();
        }
        System.out.println("Entered Array Elements are:");
        System.out.println(Arrays.toString(arr));
        int maxSum=0;
        String pairs=" ";
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int Summation=arr[i]+arr[j];
                if(Summation>maxSum){
                    maxSum=Summation;
                    pairs=Integer.toString(arr[i])+","+Integer.toString(arr[j]);
                }
            }
        }
        System.out.println("Greatest Pair in the Array is:");
        System.out.println(pairs);
        System.out.println("Sum of these Pair is:");
        System.out.println(maxSum);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
