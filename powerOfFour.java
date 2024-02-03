import java.util.*;
public class powerOfFour {
    public static void main(String[] args) {
        double n = 216;
        double result = Math.pow(n, 0.5);

        double answer = Math.pow(result, 0.5);

        for(int i = 0; i < n; i++){
            if(Math.pow(i, 4) == n){
                System.out.println("True");
                break;
            }else{
                System.out.println("False");    
            }
        }
    }
}
