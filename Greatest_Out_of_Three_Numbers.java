import java.util.Scanner;

public class Greatest_Out_of_Three_Numbers {
    public static void main(String [] args){
        System.out.println("Enter First Number:");
        Scanner sc= new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int input2 = sc.nextInt();
        System.out.println("Enter Third Number:");
        int input3 = sc.nextInt();
        int sum=0;
        int temp = ((input1>input2)?input1:input2);
        int tempAno = ((input3>temp)?input3:temp);
        System.out.println("Largest Number is:" + " "+ tempAno);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
