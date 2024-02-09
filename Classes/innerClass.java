package Classes;

import Classes.school.cs_dept;

/*
 * Inner class : one obj doesnt exist until other one is touched (why inner class)
 * cant make obj here coz it is in different class !! 
 */

class school{
    school(){
        System.out.println("Default constructor");
    }

    class cs_dept{

        cs_dept(){
            System.out.println("Cs dept constructor created");
        }
        void techfest(){
            System.out.println("Techfest initiated");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        school obj = new school();
        school.cs_dept innerobj =  obj.new cs_dept();

        innerobj.techfest();
    }    
}
