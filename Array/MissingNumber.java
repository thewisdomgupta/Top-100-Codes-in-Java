import java.util.Scanner;
public class MissingNumber {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5,6,8,9,10};
        int totalSum=(10*(10+1)/2);
        int arrSum=0;
        for(int i=0; i<arr.length; i++){
            arrSum=arrSum+arr[i];
        }
        int difference=totalSum-arrSum;
        System.out.println("Missing Number between 1 t0 10 is:");
        System.out.println(difference);

    }
}
