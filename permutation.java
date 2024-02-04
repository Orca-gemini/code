public class permutation {

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void solve(int[] arr, int num, int num1){
        if(num == num1){
            print(arr);
        }
        else{
            // first swap and then backtrack .
            for(int i = num; i <= num1; i++){
                swap(arr, num, i);
                solve(arr, num + 1, num1);

                // Backtracking to the previous node !
                swap(arr, num, i);
            }   
        }
    }

    public static void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3};
        solve(arr, 0, arr.length - 1);
        
    }
}
