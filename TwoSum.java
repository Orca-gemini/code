

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] brr = {5, 6, 7, 4};
        int n = arr.length;
        int[] crr = new int[n];

        int n1 = arr.length;
        int n2 = brr.length;

        if(n1 > n2){
            for(int i = 0; i < n1; i++){
                crr[i] = arr[i] + brr[i];
            }
        }else{
            for(int i = 0; i < n2; i++){
                crr[i] = arr[i] + brr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(crr[i] + " ");
        }
    }
}
