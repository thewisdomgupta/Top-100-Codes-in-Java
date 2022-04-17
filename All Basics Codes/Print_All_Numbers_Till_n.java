package javaallpackage;
import java.util.Scanner;
public class Print_All_Numbers_Till_n {
    public static void main(String [] args){
        System.out.println("Enter the nth Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("All the Numbers till"+" "+n+" "+"are:");
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
        }
    }
}

//This Code is Contributed by Vivek Kumar Gupta
