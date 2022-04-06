public class Sum_of_Two_Array_Elements {
    public static void main(String [] args){
        int [] arr1={1,2,3,4,5,6,7,8,9};
        int [] arr2={5,6,7,8,9,2,3,4,6};
        int sum1=0;
        int sum2=0;
        for(int i=0; i<arr1.length; i++){
                sum1=sum1+arr1[i];
                sum2=sum2+arr2[i];
        }
        System.out.println("Sum of the Elements of Both Arrays is:");
        System.out.println(sum1+sum2);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
