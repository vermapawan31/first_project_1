package collection;

import com.sun.tools.javac.util.List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class LearningList {


    public static void main(String[] args) {
        List<Integer> rollno = List.of(1, 2, 3, 4, 5);
        System.out.println(rollno);
        //   rollno.add(9); not supported
        System.out.println(rollno);

        ArrayList<Integer> numbers = new ArrayList<Integer>(rollno);
      //  numbers.add(1, 3);
        numbers.add(8);
        numbers.set(2,78);
        numbers.set(3, 78);
        System.out.println(numbers);
        System.out.println(rollno);


        ArrayList<Integer> empid = new ArrayList<>();
        System.out.println(empid);
        empid.add(123);
        empid.add(432);
        System.out.println(empid);

        empid.addAll(numbers);
        System.out.println(empid);

//        numbers.addAll(empid);
//        System.out.println(numbers);

        // for loop
        for(int i=0;i< numbers.size();i++){
            System.out.println("testing "+ numbers.get(i));
        }
        //enhanced for loop
        for(Integer i:numbers){
            System.out.println("enhanced "+i);
        }

        //Iterator
        Iterator it= numbers.iterator();
        while(it.hasNext()){
            System.out.println("iterator "+it.next());
        }
    }

}
