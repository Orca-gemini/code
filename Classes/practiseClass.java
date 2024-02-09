package Classes;
import java.io.*;
import java.util.*;

class Team{
    String Country;
    String name;
    int matches;
    int age;
    double avg;
    double result;

    Team(String Country, String name, int matches, int age, double avg, double result){
        this.Country = Country;
        this.name = name;
        this.matches = matches;
        this.age = age;
        this.result = result;
        this.avg = avg;
    }

    public void show(){
        System.out.println(Country + name + matches + age + avg + result);
    }
}

public class practiseClass {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Team t = new Team("India", "Sachin", 300, 30, 45.1, 53.36);
        Team t1 = new Team("America", "Ac", 256, 25, 25.36, 589.3);
        Team t2 = new Team("California", "Gavaskar", 256, 23, 23.65, 569.32);

        t.show();
        t1.show();
        t2.show();
    }
}
