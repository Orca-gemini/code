package Classes;

class Count{
    public static int count = 0;
    // initialize once and update after every iteration !! 

    Count(){
        count++;
    }
}

public class countObj {
    public static void main(String[] args) {
        Count obj1 = new Count();
        Count obj2 = new Count();
        Count obj3 = new Count();
        Count obj4 = new Count();
        Count obj5 = new Count();

        System.out.println("The object count is: " + Count.count);
    }
}
