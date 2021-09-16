package collection;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {


    int k=30;
    int l=20;
    int sum (){
        return k+l;

    }
    public static void main(String[] args) {


        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("pawan");
        studentName.add("neha");
        studentName.add("vikram");
        studentName.set(2,"priyam");
        studentName.add("proveer");
        studentName.remove("priyam");
        studentName.add(2, "mukesh");


        System.out.println(studentName);
        System.out.println(studentName.get(0)+" "+ studentName.get(1)+ " "+ studentName.get(2));
        System.out.println(studentName.size());
        System.out.println(studentName.contains("neha"));

        if (studentName.contains("priyam")== false){
            studentName.add("abhishek");
        }
        else{
            System.out.println("priyam found");
        }
        System.out.println(studentName);

        List<Integer> rollNumber=new ArrayList<>();
        rollNumber.add(3);
        rollNumber.add(6);
        rollNumber.add(9);
        System.out.println(rollNumber);

        ArrayList<String> empName = new ArrayList<>();
        empName.add("abc");
        empName.add("def");
        empName.add("pawan");
        System.out.println(empName);

        studentName.addAll(empName);
        System.out.println(studentName);
    }

}
