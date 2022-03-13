package javaallpackage;

import java.util.Scanner;

public class SumofDigitofNumber {
    public static void main(String [] args){
        System.out.println("Enter a Number to Check sum of its Digit:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            sum=(sum+(n%10));
            n=n/10;
        }
        System.out.println("Sum of the Digit of the number"+" "+ temp+" "+"is"+" "+ sum);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
