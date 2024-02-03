public class binarySearch {

    public static int search(int[] arr, int start, int end, int key){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == key){
                return mid;
            }
    
            if(arr[mid] > key){
                return search(arr, start, mid - 1, key);
            }
            return search(arr, mid + 1, end, key);
        }
        return -1;      
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length - 1;

        System.err.println(search(arr, 0, n, 5));
    }
}
