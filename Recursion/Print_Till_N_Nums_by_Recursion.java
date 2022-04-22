package javaallpackage;
public class Print_Till_N_Nums_by_Recursion {
    public static void printNumber(int n){
        if(n==10){
            return;
        }

        System.out.print(n+" ");
        printNumber(n+1);
    }
    public static void main(String[] args){
        int n=1;
        System.out.println("All the Numbers till 9 are:");
        printNumber(n);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
