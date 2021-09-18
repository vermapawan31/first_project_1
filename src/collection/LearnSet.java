package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {
        Set<Integer> numbers= new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Hashset: "+numbers);

        Set<Integer> numbers2=new LinkedHashSet<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(30);
        numbers2.add(24);
        System.out.println("LinkedHashset: "+ numbers2);

        Set<Integer> numbers3= new TreeSet<>();
        numbers3.add(11);
        numbers3.add(20);
        numbers3.add(198);
        numbers3.add(16);
        numbers3.add(46);
        System.out.println("TreeHashset: "+ numbers3);



    }
}
