package Classes;


// Passing members of one class to another class !! 

class Emp{
    int data;
    int name;
    int salary;

    Emp(int data, int name, int salary){
        this.data = data;
        this.name = name;
        this.salary = salary;
    }

    void show(){
        System.out.println(data);
        System.out.println(name);
        System.out.println(salary);
    }
}

class an{
    int pass;
    public an(){
    }
}

public class passingValues {
    public static void main(String[] args) {
        Emp e = new Emp(45, 01, 25000);
        e.show();
    }
}
