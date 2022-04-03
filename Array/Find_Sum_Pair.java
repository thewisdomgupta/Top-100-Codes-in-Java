//Find Total Number of Pairs available in an array whose sum is 8.
//You can change the total sum from 8 to 9 whatever you can so just change in line number 32.
//int totalSum=;
//Sample Input
//6 -->Length of array
//5
//0
//3
//8
//6
//1

//Output 2
//Explanation --> First Pair (5,3),  Second Pair (0,8). Both Pair Elements Sum is 8.

import java.util.Scanner;
public class Find_Sum_Pair {
    public static void main(String [] args){
        System.out.println("Enter the Length of Array:");
        Scanner vivek=new Scanner(System.in);
        int n=vivek.nextInt();
        System.out.println("Enter the Array Elements");
        int [] arr=new int[10];
        for(int i=0; i<n; i++){
            arr[i]=vivek.nextInt();
        }
        System.out.println("Entered Array Elements are:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        //Count Sum Pair
        int totalSum=8;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int checkSum=(arr[i]+arr[j]);
                        if(checkSum==totalSum){
                            count=count+1;
                        }
            }
        }
        System.out.println();
        System.out.println("Total Number of Pair in given array whose sum is 8 are:");
        System.out.println(count);
    }
}

//Output
//    Enter the Length of Array:
//        6
//        Enter the Array Elements
//        5
//        0
//        3
//        8
//        6
//        1
//        Entered Array Elements are:
//        5 0 3 8 6 1
//        Total Number of Pair in given array whose sum is 8 are:
//        2
//This Code is Contributed by Vivek Kumar Gupta
