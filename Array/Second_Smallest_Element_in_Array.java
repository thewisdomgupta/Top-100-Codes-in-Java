package javaallpackage;
import java.util.Scanner;
public class Second_Smallest_Element_in_Array {
    public static void main(String [] args){
        System.out.println("Enter the Size of Array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements:");
        int []arr=new int[10];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        int small1=arr[0];
        int small2=arr[0];
        for(int i=0; i<n;i++){
            if(small1>arr[i]){
                small2=small1;
                small1=arr[i];
            }
            else if(small2>arr[i]){
                small2=arr[i];
            }
        }
        System.out.println("Second Smallest element in the array is:"+" "+small2);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
