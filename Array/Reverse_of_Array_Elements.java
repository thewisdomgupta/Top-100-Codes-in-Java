package javaallpackage;

import java.util.Scanner;

public class Reverse_of_Array_Elements {
    public static void main(String[] args){
        System.out.println("Enter the size of Array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[10];
        System.out.println("Enter the Array Elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse of the Array Elements are:");
        for(int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
//This Code is Contributed by Vivek Kumar Gupta
