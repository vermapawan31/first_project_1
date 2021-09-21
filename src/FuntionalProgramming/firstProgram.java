package FuntionalProgramming;

import com.sun.tools.internal.xjc.model.CElement;

import java.util.ArrayList;
import java.util.List;

public class firstProgram {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("pawan");
        list.add("vikram");
        list.add("mukesh");

     //   printList(list);
        printList1(list);
    }


//    public static void printList(List<String> list) {
//        for (String element : list) {
//            System.out.println(element);
//        }
//    }

    public static void printList1(List<String> list) {

        list.stream().filter(element->element.endsWith("n")).forEach(element-> System.out.println(element));

        }

    }

