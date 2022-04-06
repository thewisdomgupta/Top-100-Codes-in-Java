public class IsUniqueORContainsDuplicate {
    public static void main(String [] args){
        int [] arr1={1,2,3,4,5,6,7,8,9};
        int [] arr2={2,4,3,1,5,8,9,7,6};
        int sum=0;
        int sum2=0;
        int mul=1;
        int mul2=1;
        for(int i=0; i<arr1.length; i++){
                sum = sum + arr1[i];
                sum2 = sum2 + arr2[i];
                mul = mul * arr1[i];
                mul2 = mul2 * arr2[i];
            }
        if(arr1.length!= arr2.length){
            System.out.println("No Unique Elements");
        }
                else if(sum==sum2 && mul==mul2){
                    System.out.println("Both the Array Contains Unique Elements");
                }
                else{
                    System.out.println("No Unique Elements");
                }
        }
    }
    //This Code is Contributed by Vivek Kumar Gupta

