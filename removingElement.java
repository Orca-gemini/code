import java.util.*;
public class removingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,2};
        int key = 2;

        int l = arr.length;
        Arrays.sort(arr);
        int count = 0;
        int[] result = new int[l];
        for(int i = 0; i < l; i++){
            if(arr[i] != key){
                result[i] = arr[i];
                count++;
                System.out.println(result);
            }
        }
        System.out.println(count);
    }
}