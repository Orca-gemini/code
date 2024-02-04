package Classes;
import java.util.*;
import java.io.*;

class Car{
    String name;
    int age;
    int percentage;

    Car(String name, int age, int percentage){
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(percentage);
    }
}

public class classSample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        int percentage = Integer.parseInt(br.readLine());

        Car obj = new Car("Yash", age, percentage);
        Car obj1 = new Car("Yash", age, percentage);
        obj.show();
        obj1.show();
    }
}
