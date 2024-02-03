import java.util.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		while(t > 0){
		    int n = Integer.parseInt(br.readLine());
		    int[] arr = new int[n];
		    
		    // no sorting 
		    for(int i = 0; i < arr.length; i++){
		        int element = Integer.parseInt(br.readLine());
		        arr[i] = element;
		    }
		    
		    ArrayList<Integer> al = new ArrayList<>();
		    
		    for(int i = 0; i < arr.length; i++){
		        al.add(arr[i]);
		    }
		    
		    for(int i = 0; i < arr.length; i++){
		        for(int j = 0; j < arr.length; j++){
		            if(arr[j] == arr[j + 1]){
		                al.remove(arr[j]);
		            }
		        }
		    }
		    t--;
		}

	}
}
