public class nextLarger {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] result = {-1, -1, -1, -1};
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++)
                if(arr[j] > arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
        

        for(int i = 0; i < arr.length; i++){
            System.out.println(result[i]);
        }
    }
}
