package javaallpackage;

import java.util.Scanner;

public class Palindrome_of_Number {
    public static void main(String[] args){
        System.out.println("Enter a Number to find it is Palindrome or Not:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverse=0;
        int rem=0;
        while(n!=0){
            rem=(n%10);
            reverse=(reverse*10)+rem;
            n=n/10;
        }
        if(temp==reverse){
            System.out.println("Number is Palindrome because Reverse of the number"+" "+ temp+" "+"is"+" "+ reverse);
        }
        else{
            System.out.println("Number is not a Palindrome");

        }
    }
}
//This Code is Contributed by Vivek Kumar Gupta
