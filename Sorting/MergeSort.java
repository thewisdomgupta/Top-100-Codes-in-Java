import java.util.Scanner;
public class MergeSort {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of the Array:");
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,n-1);
        System.out.println("Sorted array is:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }
    }
    public static void mergeSort(int [] arr, int start, int end){
        if(start<end){
            int mid = start+(end-start)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1,end);
            merge(arr, start, mid, end);
        }
    }
    public static void merge(int [] arr, int start, int mid, int end){
        int asize=mid-start+1;
        int bsize=end-mid;
        int [] a=new int[asize];
        int [] b=new int[bsize];
        int k=0;
        for(int i=start; i<=mid; i++){
            a[k]=arr[i];
            k++;
        }
        k=0;
        for(int i=mid+1; i<=end; i++){
            b[k]=arr[i];
            k++;
        }
        int i=0; int j=0;
        k=start;
        while(i<asize && j<bsize){
            if(a[i]<b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }
            else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<asize){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<bsize){
            arr[k]=b[j];
            j++;
            k++;
        }

    }
}
//This code is contributed by Vivek Kumar Gupta
