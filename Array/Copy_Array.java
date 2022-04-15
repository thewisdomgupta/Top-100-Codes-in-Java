import java.util.Arrays;
public class Copy_Array {
    public static void main(String [] args){
        int [] array_First={45,56,98,52,92};
        int [] array_Second;
        array_Second=array_First;
        System.out.println("Elements in First Array are:");
        System.out.println(Arrays.toString(array_First));
        System.out.println("After Copying Elements in Second Array are:");
        System.out.println(Arrays.toString(array_Second));
    }
}
//This Code is Contributed by Vivek Kumar Gupta
