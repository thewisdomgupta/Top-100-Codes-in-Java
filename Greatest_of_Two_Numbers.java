import java.util.Scanner;

public class Greatest_of_Two_Numbers {
    public static void main(String [] args){
        System.out.println("Enter First Number:");
        Scanner sc= new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int input2 = sc.nextInt();
        if(input1>input2){
            System.out.println(input1 + " " + "is greater");
        }
        else{
            System.out.println(input2 + " " + "is greater");
        }
    }
}
//This Code is Contributed by Vivek Kumar Gupta
