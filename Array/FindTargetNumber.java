import java.util.Arrays;
import java.util.Scanner;
public class FindTargetNumber {
    public static void main(String [] args){
        System.out.println("Enter Length of an Array:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter Array Elements:");
        int [] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Entered Array Elements are:");
        System.out.println(Arrays.toString(arr));
        int targetNumber=5;
        boolean found=false;
        for(int i=0; i<n; i++){
            if(arr[i]==targetNumber){
                found=true;
                System.out.println("Element found"+" "+arr[i]+" "+"at index"+" "+i);
            }
        }
        if(found==true){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
