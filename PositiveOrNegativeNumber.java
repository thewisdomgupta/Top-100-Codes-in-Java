import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String [] args){
        System.out.println("Please Enter a Number to check positive or negative:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input>0){
            System.out.println(input + " " + "is a positive number");
        }
        else{
            System.out.println(input + " " + "is a negative number");
        }

    }
}
