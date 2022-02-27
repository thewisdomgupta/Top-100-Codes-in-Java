import java.util.Scanner;

public class Sum_of_Numbers_in_Given_Range {
    public static void main(String [] args){
        System.out.println("Enter Starting Number:");
        Scanner sc= new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println("Enter Last Number:");
        int input2 = sc.nextInt();
        int sum=0;
        for(int i=input1; i<=input2; i++){
            sum=(sum+i);
        }
        System.out.println("Sum is" + " "+ sum);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
