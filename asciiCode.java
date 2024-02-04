import java.io.*;
public class asciiCode {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            int element = Integer.parseInt(br.readLine());
            arr[i] = element;
        }
        int[] result = new int[5];
        for(int i = 0; i < arr.length; i++){
            System.out.println((char)arr[i] + " - " + arr[i]);
            result[i] = (char)arr[i];
        }

         /* 
          * 18 - 
          */
    }
}
