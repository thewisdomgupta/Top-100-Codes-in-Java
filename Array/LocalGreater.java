public class LocalGreater {
    public static void main(String[] args) {
        int a[] = {10, 5, 11, 4, 8, 7, 3};
        for(int i=0; i<a.length; i++){
            if(i==0){
                if (a[i]>a[i+1]){
                    System.out.println(a[i]);
                }
            }
            if(i==a.length-1){
                if(a[a.length-1]>a[a.length-2]){
                    System.out.println(a[a.length-1]);
                }
            }
            if(i>0 && i<a.length-1){
                if(a[i]>a[i-1] && a[i]>a[i+1]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}

