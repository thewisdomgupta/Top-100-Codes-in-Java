package javaallpackage;
import java.util.Scanner;
public class Second_Largest_Element_in_Array {
    public static void main(String[] args){
        System.out.println("Enter the Size of Array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the Elements of Array:");
        int []arr=new int[10];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        int large1=arr[0];
        int large2=arr[0];
        for(int i=0; i<n; i++){
            if(large1<arr[i]){
                large2=large1;
                large1=arr[i];
            }
            else if(large2<arr[i]){
                large2=arr[i];
            }
        }
        System.out.println("Second Largest Elements in Array is:"+" "+large2);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
