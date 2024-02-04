import java.util.*;
import java.io.*;

class ChefProduct
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0){
		    int n = Integer.parseInt(br.readLine());
		    int[] arr = new int[n];
		    
		    // Took the odd numbers in the array
		    for(int i = 0; i < n; i++){
		        if(i % 2 != 0){
		            arr[i] = i;
		        }
		    }
		    
            // Now making the sub arrays: 
            
		}
	}
}
