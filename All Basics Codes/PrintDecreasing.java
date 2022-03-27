package javaallpackage;

import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args){
        System.out.println("Enter nth Number:");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("All the numbers from"+" "+n+" "+"to 1 are:");
        for(int i=n; i>0; i--){
            System.out.print(i+" ");
        }
    }
}
