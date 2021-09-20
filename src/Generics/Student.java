package Generics;

public class Student {
    public static void main(String[] args) {


        School<String> sc = new School<>();
        sc.addStudent("pawan");
        System.out.println(sc);


        School<Integer> sc1= new School<>();
        sc1.addStudent(1);
        System.out.println(sc1);
        System.out.println(sc.get(0));
        System.out.println(sc1.get(0));

       // sc.addStudentRollno(1);
       // System.out.println(sc.ar1);


    }
}
