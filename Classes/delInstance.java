package Classes;

class del{
    int data;
    int abs;

    del(int data, int abs){
        this.data = data;
        this.abs = abs;
    }
}


public class delInstance {
    public static void main(String[] args) {
        del obj = new del(5, 6);
        System.out.println(obj);

        obj = null;
        System.out.println(obj);

    }
    
}
