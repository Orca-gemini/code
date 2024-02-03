import java.io.*;
import java.util.Arrays;

public class example {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){
            System.out.println("Enter number of subject in " + i + "semester");
            int element = Integer.parseInt(br.readLine());
             
            for(int j = 0; j < element; j++){
                System.out.println("Enter marks: ");
                int marks = Integer.parseInt(br.readLine());
            }
        }
    }
}
