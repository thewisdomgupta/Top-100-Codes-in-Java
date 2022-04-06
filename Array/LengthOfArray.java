import java.util.Arrays;
import java.util.Scanner;
public class LengthOfArray {
    public static void main(String [] args){
        System.out.println("Enter Array Length");
        Scanner vivek=new Scanner(System.in);
        int n=vivek.nextInt();
        System.out.println("Enter Array Elements");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= vivek.nextInt();
        }
        System.out.println("Entered Array Elements are:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Length of the Array is:"+" "+n);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
