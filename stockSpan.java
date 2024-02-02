import java.util.*;
public class stockSpan {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int l = arr.length;

        int[] result = new int[l];
        // check for loop
        for(int i = 0; i <  arr.length - 1; i++){
            if(arr[i] > arr[i + 1]){
                result[i] = (int)(Math.pow(1, 3));
            }else{
                result[i] = (int)(Math.pow(2, 3));
            }
        }
        for(int i = 0; i < result.length - 1; i++){
            System.out.println(result[i]);
        }
    }
}
