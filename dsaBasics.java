import java.util.*;
import java.io.*;
 
public  class dsaBasics {
    static class Tree{
        int data;
        Tree left;
        Tree right; 
        public Tree(int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }

	public static void main(String args[]) throws IOException { 
    /*
     * Main function is reserved. Entry point of the java program !
     * public -- access 
     * static -- main method is a method of main class , Also to run the file without creating 
     *          an object of the main class , then we use static. 
     * 
     * void -- won't return anything. 
     * Command line arguements -- string[] args 
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Array list 
        ArrayList<Integer> al = new ArrayList<>();
        int a = Integer.parseInt(br.readLine());
        al.add(a);
        System.out.println(al);

        // Linked list 
        LinkedList<Integer> l = new LinkedList<>();
        System.out.println("Enter the first number: ");
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
        	int element = Integer.parseInt(br.readLine());
        	l.add(element);
        }

        // Iterator bruh 
        for(Integer x : l) {
            System.out.println("The number is: ");
        	System.out.println(x);
        }

        // Tree 
        Tree root = null;
        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i < size; i++){
            int element = Integer.parseInt(br.readLine());
            root = insert(root, element);
        }

        // Print all the elements: 
        result(root);
    }

    private static Tree insert(Tree root, int data){
        if(root == null){
            return new Tree(data);
        }

        // recursive phase 
        if(data < root.data){
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    private static void result(Tree root){
        if(root != null){
            result(root.left);
            System.out.println(root.data + " ");
            result(root.left);
        }
    }
}