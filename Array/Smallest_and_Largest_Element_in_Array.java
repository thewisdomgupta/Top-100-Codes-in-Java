package javaallpackage;

import java.util.Scanner;

public class Smallest_and_Largest_Element_in_Array {
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
        int small=arr[0];
        int large=arr[0];
        for(int i=0; i<n;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        for(int i=0; i<n;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        System.out.println("Smallest element in the array is:"+" "+small);
        System.out.println("Largest element in the array is:"+" "+large);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
