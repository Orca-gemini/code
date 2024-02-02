public class permutation {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void solve(int[] arr, int num, int num1){
        if(num == num1){
            return;
        }
        else{
            // first swap and then backtrack .
            swap(arr, num, num1);
            solve(arr, num + 1, num1);

            // Backtracking to the previous node !
            swap(arr, num, num1);
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 4 , 5 , 7};
        
        solve(arr, )
    }
}
