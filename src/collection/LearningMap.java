package collection;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LearningMap {

    public static void main(String[] args) {
        Map<Integer,String> map1= new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(2, "A");
        map1.put(1, "A");
        System.out.println(map1);
        System.out.println(map1.get(2));
        System.out.println(map1.containsKey(1));


        String str= "This is a great thing";



        }

    }

