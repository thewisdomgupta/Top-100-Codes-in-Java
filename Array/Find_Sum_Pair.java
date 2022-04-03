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
//This Code is Contributed by Vivek Kumar Gupta
