public class MaxProduct {
    public static void main(String [] args){
        int [] arr={20,30,40,50,60,70,80};
        int maxProduct=0;
        String pairs=" ";
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                int product=arr[i]*arr[j];
                if(product>maxProduct){
                    maxProduct=product;
                    pairs=Integer.toString(arr[i])+","+Integer.toString(arr[j]);
                }
            }
        }
        System.out.println("Greatest Pairs in the Array are:");
        System.out.println(pairs);
        System.out.println("Product of the Greatest Pairs in the Array is:");
        System.out.println(maxProduct);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
