import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String [] args){
        System.out.println("Please Enter a Number to check it is Odd or Even:");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        if(inputNum%2==0){
            System.out.println(inputNum + " " + "is an Even Number");
        }
        else{
            System.out.println(inputNum + " " + "is an Odd Number");
        }
    }
}
//This Code is Contributed by Vivek Kumar Gupta
