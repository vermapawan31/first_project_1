package FuntionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class Filters {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(12);
        list.add(18);

        evenOdd(list);
    }


    public static void evenOdd(List<Integer> list){
        list.stream().filter(element-> element%2==0).forEach(element-> System.out.println(element));

    }
}
