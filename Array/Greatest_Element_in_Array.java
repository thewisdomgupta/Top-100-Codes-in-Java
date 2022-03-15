package javaallpackage;

import java.util.Scanner;

public class Greatest_Element_in_Array {
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
        int m=arr[0];
        for(int i=0; i<arr.length;i++){
            if(m<arr[i]){
                m=arr[i];
            }
        }
        System.out.println("Greatest element in the array is:"+" "+m);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
