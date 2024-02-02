import java.io.*;
public class rsa {

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the values for a and b: ");
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        // Generating public key : 
        int n = a * b;
        System.out.println("The first part of the primary key: " + n);
        System.out.println(gcd(20, 30));
        // Generating private key :  
        int phi = (a - 1) * (b - 1);
        System.out.println(phi);

        int e = 2;
        while((e > 1) && (e < phi)){
            if(gcd(e, phi) == 1){
                break;
            }
            // e increment 
            e = e + 1;
        }
        
        // Calculating private key
        int k = 0;
        int result = 0;
        int dec = 0;
        while(k == 0){
            dec = (k * e) % phi;
            if(dec == 1){
                result = k;
                break;
            }
            k++;
        }
        System.out.println("d is: " + result);
    }
}
