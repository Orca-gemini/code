public class lexiArray {
    public static int permutation(int[] arr, int start, int last){
        start = arr[0];
        int l = arr.length;
        last = arr[l - 1];

        if(start == last){
            print(arr);
        }else{
            for(int i = 0; i < arr.length; i++){
                swap(arr, start, i);
                permutation(arr, start + 1, last);
                swap(arr, start, i);
            }
        }

        int count = 0;
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int start = arr[0];
        int last = arr[arr.length - 1];
        permutation(arr, start, last);
    }

    public static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    } 

    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
