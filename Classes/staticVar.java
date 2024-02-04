package Classes;

class Sample{
    static int x = 4;
    int y;
    Sample(){
        this.y = 20;
    }
}

public class staticVar {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        Sample s2 = new Sample();

        Sample.x = 45;

        System.out.println(s1.x);
        System.out.println(s1.y);
        System.out.println(s2.x);
        System.out.println(s2.y);
    }

}
