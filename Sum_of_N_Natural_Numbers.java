import java.util.Scanner;

public class Sum_of_N_Natural_Numbers {
    public static void main(String [] args){
        System.out.println("Enter the Number till you want to Check Sum:");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int sum =0;
        for(int i=0; i<=inputNum; i++){
            sum = (sum+i);
        }
        System.out.println("Sum is:"+ " " + sum);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
