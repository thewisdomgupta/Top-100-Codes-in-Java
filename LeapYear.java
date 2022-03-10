package javaallpackage;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        System.out.println("Enter a Year to Check it is Leap Year or Not:");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("Year"+" "+ year + " "+ "is a Leap Year");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("Year"+" "+ year + " "+ "is a Leap Year");
        }
        else{
            System.out.println("Year"+" "+ year + " "+ "is not a Leap Year");
        }
    }
}
//This Code is Contributed by Vivek Kumar Gupta
